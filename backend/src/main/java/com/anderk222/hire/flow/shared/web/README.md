# shared / web

Piezas HTTP transversales:

- `ApiError` — forma estándar de error que devuelve la API.
- `GlobalExceptionHandler` — único lugar que traduce excepciones a
  respuestas HTTP para toda la aplicación. Los controladores de cada
  módulo NO deben capturar estas excepciones; simplemente deben dejarlas
  propagar.
