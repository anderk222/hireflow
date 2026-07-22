# shared / domain / exception

Jerarquía base de excepciones de negocio.

- `DomainException` — clase abstracta; cada módulo puede extenderla con
  excepciones propias (p. ej. `VacancyClosedException`).
- `ResourceNotFoundException` — ya lista para usar: "no existe la vacante
  con id X", etc.

`GlobalExceptionHandler` (en `shared/web`) traduce estas excepciones a
respuestas HTTP, así que los controladores nunca necesitan capturarlas.
