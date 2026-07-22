# shared / exception

`ValidationException`: se lanza cuando un comando/DTO de entrada falla una
validación de la capa de casos de uso, antes de llegar a las reglas de
negocio del dominio. `GlobalExceptionHandler` la traduce a un
`400 Bad Request`.
