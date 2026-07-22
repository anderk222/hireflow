# HireFlow

Cascarón de arquitectura para el proyecto académico de Diseño y
Arquitectura de Software. Cubre el sistema descrito en
[`HireFlow_documentacion_diagrama.html`](HireFlow_documentacion_diagrama.html):
reclutamiento y contratación, desde la publicación de una vacante hasta la
aceptación de la oferta laboral (ahí están el diagrama de casos de uso y la
especificación de cada uno).

Este repositorio contiene **solo la estructura** (paquetes/carpetas,
interfaces, DTOs y clases con métodos `TODO`), no la implementación de las
reglas de negocio. La idea es que se vea con claridad cómo se separan las
responsabilidades antes de llenarlas de código.

## Estructura del repositorio

- `HireFlow_documentacion_diagrama.html` — documentación funcional del
  sistema: casos de uso, actores y arquitectura propuesta.
- `backend/` — Spring Boot (Java 17), monolito modular organizado por
  módulos de negocio, cada uno con capas `domain` / `usecase` / `service`
  / `web` / `persistence` inspiradas en **Clean Architecture** (sin la
  ceremonia de puertos/adaptadores "in/out" de la arquitectura hexagonal
  completa) y apoyado en Lombok para reducir el código repetitivo. Ver
  [`backend/src/main/java/com/anderk222/hire/flow/README.md`](backend/src/main/java/com/anderk222/hire/flow/README.md)
  para el detalle de módulos y patrones de diseño aplicados (State,
  Strategy, Observer).
- `frontend/` — SPA en Angular (standalone components), organizada por
  módulos de negocio + carpetas transversales (`core`, `shared`, `layout`).
  Ver [`frontend/src/app/README.md`](frontend/src/app/README.md).

## Cómo recorrer el proyecto

Cada carpeta trae su propio `README.md` explicando para qué sirve. Un buen
orden de lectura:

1. `HireFlow_documentacion_diagrama.html` — casos de uso y arquitectura
   propuesta (el punto de partida funcional).
2. `backend/src/main/java/com/anderk222/hire/flow/README.md` — mapa de
   módulos del backend y por qué se organizan así.
3. Dentro de cada módulo (p. ej. `vacancy/`), sus README de `domain`,
   `usecase`, `service`, `web` y `persistence` explican cada capa.
4. `frontend/src/app/features/README.md` — mapa de módulos del frontend,
   que refleja los mismos límites que el backend.

## Convenciones

- Código, nombres de paquetes/clases y comentarios: **en inglés**
  (vacancy, candidate, candidacy, interview, evaluation, hiring,
  notification).
- Documentación (`README.md`): **en español**.
- Los casos de uso del documento original (CU-01 a CU-07) se referencian
  en comentarios y README para que sea fácil rastrear qué parte del código
  corresponde a qué caso de uso.
- Backend: Lombok (`@Getter`, `@Setter`, `@RequiredArgsConstructor`, etc.)
  para no escribir a mano constructores/getters/setters e inyección de
  dependencias por constructor.
