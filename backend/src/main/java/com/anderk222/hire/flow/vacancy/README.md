# vacancy

Módulo de negocio: gestión y publicación de vacantes. Cubre CU-01 (listar/buscar vacantes abiertas) y CU-03 (publicar/editar/cerrar una vacante).

Capas internas — ver el README de cada una para el detalle:

- `domain/` — entidades, reglas de negocio y el contrato del repositorio.
- `usecase/` — un contrato (interfaz) por caso de uso, más sus DTOs.
- `service/` — implementación de esos casos de uso.
- `web/` — controlador REST.
- `persistence/` — entidad JPA y adaptador del repositorio.
