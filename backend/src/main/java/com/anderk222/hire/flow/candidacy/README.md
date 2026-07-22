# candidacy

Módulo de negocio: postulación de un candidato a una vacante. Cubre CU-02 (registrar la postulación) y CU-04 (revisión y decisión del reclutador).

Capas internas — ver el README de cada una para el detalle:

- `domain/` — entidades, reglas de negocio y el contrato del repositorio.
- `usecase/` — un contrato (interfaz) por caso de uso, más sus DTOs.
- `service/` — implementación de esos casos de uso.
- `web/` — controlador REST.
- `persistence/` — entidad JPA y adaptador del repositorio.
