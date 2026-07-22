# com.anderk222.hire.flow

Monolito modular: un solo desplegable, dividido en paquetes por módulo de
negocio. Cada módulo se organiza con las mismas capas internas (ver más
abajo), inspiradas en **Clean Architecture** pero simplificadas a propósito
para un cascarón académico — sin la ceremonia de puertos/adaptadores
"in/out" de la arquitectura hexagonal completa.

## Módulos

| Módulo         | Casos de uso cubiertos                         |
|----------------|-------------------------------------------------|
| `vacancy`      | CU-01 (listar/buscar vacantes), CU-03 (publicar) |
| `candidate`    | CU-02 (perfil del candidato)                     |
| `candidacy`    | CU-02 (postular), CU-04 (revisar/decidir)        |
| `interview`    | CU-05 (agendar entrevista)                       |
| `evaluation`   | CU-06 (registrar evaluación)                     |
| `hiring`       | CU-07 (oferta laboral y contratación)             |
| `notification` | Transversal: confirmaciones y recordatorios       |
| `shared`       | Núcleo común (excepciones, evento de dominio, manejo de errores HTTP) |

## Capas dentro de cada módulo

```
<modulo>/
├── domain/        Entidades y reglas de negocio. No dependen de Spring
│                  ni de JPA. Aquí también vive el contrato del
│                  repositorio (una interfaz, p. ej. VacancyRepository)
│                  y, si aplica, los patrones de diseño del módulo.
├── usecase/       Contratos de los casos de uso: una interfaz por
│                  operación (Interface Segregation Principle) y los
│                  DTOs de entrada/salida (dto/command, dto/response).
├── service/       Implementación de los casos de uso (el "interactor"):
│                  orquesta domain + usecase, sin reglas de negocio propias.
├── web/           Adaptador de entrada HTTP (controladores REST).
└── persistence/   Adaptador de salida: entidad JPA, repositorio Spring
                   Data y la clase que implementa el contrato de
                   domain/ sobre esa infraestructura.
```

La regla de dependencia es siempre **hacia adentro**: `web` y `persistence`
conocen `usecase` y `domain`; `service` conoce `domain` y `usecase`;
`domain` no conoce a nadie. Así, cambiar de base de datos o de framework
web no obliga a tocar las reglas de negocio ni los contratos de los casos
de uso (Open/Closed + Dependency Inversion).

## Patrones de diseño aplicados

- **State** (`candidacy/domain/state`) — el ciclo de vida de una
  postulación (RECEIVED → ... → HIRED/REJECTED) se modela con un estado
  por status; cada uno solo sabe a qué estados puede pasar. Agregar un
  estado nuevo no obliga a tocar los demás.
- **Strategy** (`evaluation/domain/strategy`) — el cálculo del resultado de
  una evaluación varía según el tipo de entrevista (HR/técnica/gerencial);
  `EvaluationService` delega en la estrategia que declara soportar ese tipo.
- **Observer** (evento `InterviewScheduledEvent` + `@EventListener` en
  `notification`) — al agendar una entrevista, `interview` publica un
  evento de dominio sin saber quién lo escucha; `notification` reacciona
  para enviar la confirmación obligatoria y, opcionalmente, agendar un
  recordatorio.

## Reglas entre módulos

Un módulo de negocio no debe depender de `web` ni de `persistence` de otro
módulo. Si necesita invocar un caso de uso de otro módulo, depende de su
interfaz en `usecase/` (p. ej. `hiring` invocará casos de uso de
`candidacy` y `vacancy` una vez implementados). Si dos módulos necesitan
compartir un concepto de dominio, ese concepto sube a `shared`.

## Lombok

Todas las entidades (dominio y JPA) y las clases con inyección de
constructor (`service`, `web`, `persistence`) usan anotaciones de
[Lombok](https://projectlombok.org/) (`@Getter`, `@Setter`,
`@NoArgsConstructor`, `@AllArgsConstructor`, `@Builder`,
`@RequiredArgsConstructor`) para no escribir a mano ese código repetitivo.
Los DTOs (`command`/`response`) siguen siendo `record` de Java: ya son
inmutables por sí solos y no necesitan Lombok.
