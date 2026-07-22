# core / interceptors

Interceptores HTTP funcionales (`HttpInterceptorFn`) registrados una sola
vez en `app.config.ts` vía `provideHttpClient(withInterceptors([...]))`.
Ejemplos: adjuntar el token de autenticación, mapear errores HTTP al modelo
`ApiError` del backend.
