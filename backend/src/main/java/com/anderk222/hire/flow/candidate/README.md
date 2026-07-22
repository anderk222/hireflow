# candidate

Módulo de negocio: perfil del candidato. Cubre CU-02 en la parte de datos personales del candidato (nombre, contacto, hoja de vida).

Capas internas — ver el README de cada una para el detalle:

- `domain/` — entidades, reglas de negocio y el contrato del repositorio.
- `usecase/` — un contrato (interfaz) por caso de uso, más sus DTOs.
- `service/` — implementación de esos casos de uso.
- `web/` — controlador REST.
- `persistence/` — entidad JPA y adaptador del repositorio.
