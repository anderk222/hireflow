# candidacy / service

Implementación de los casos de uso de **postulación de un candidato a una vacante** (el "interactor" en
términos de Clean Architecture): orquesta la entidad de dominio y el
contrato del repositorio, pero no contiene reglas de negocio propias —
esas viven en `domain/`. Usa `@RequiredArgsConstructor` de Lombok para la
inyección por constructor.
