# evaluation

Módulo de negocio: registro de evaluaciones tras una entrevista. Cubre CU-06 (registrar una evaluación y calcular su resultado).

Capas internas — ver el README de cada una para el detalle:

- `domain/` — entidades, reglas de negocio y el contrato del repositorio.
- `usecase/` — un contrato (interfaz) por caso de uso, más sus DTOs.
- `service/` — implementación de esos casos de uso.
- `web/` — controlador REST.
- `persistence/` — entidad JPA y adaptador del repositorio.
