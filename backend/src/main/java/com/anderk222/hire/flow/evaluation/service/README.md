# evaluation / service

Implementación de los casos de uso de **registro de evaluaciones tras una entrevista** (el "interactor" en
términos de Clean Architecture): orquesta la entidad de dominio y el
contrato del repositorio, pero no contiene reglas de negocio propias —
esas viven en `domain/`. Usa `@RequiredArgsConstructor` de Lombok para la
inyección por constructor.
