# notification

Módulo de negocio: envío de notificaciones. Cubre transversal a CU-05: confirmación obligatoria y recordatorio opcional de entrevista.

Capas internas — ver el README de cada una para el detalle:

- `domain/` — entidades, reglas de negocio y el contrato del repositorio.
- `usecase/` — un contrato (interfaz) por caso de uso, más sus DTOs.
- `service/` — implementación de esos casos de uso.
- `web/` — controlador REST.
- `persistence/` — entidad JPA y adaptador del repositorio.
