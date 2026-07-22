# src / app

Raíz de la aplicación Angular. Organizada por módulos de negocio
(`features/`) más las carpetas transversales típicas de un proyecto Angular
mediano:

- `core/` — servicios singleton, guards e interceptores HTTP.
- `shared/` — componentes/pipes/directivas presentacionales reutilizados
  entre módulos.
- `layout/` — shell visual (header, sidebar, contenedor con
  `<router-outlet>`).
- `features/` — un directorio por módulo de negocio (`vacancy`,
  `candidate`, `candidacy`, `interview`, `evaluation`, `hiring`,
  `notification`, `auth`), cada uno con la misma forma interna. Ver
  `features/README.md`.
- `app.routes.ts` — ensambla las rutas de cada módulo (`loadChildren`,
  carga perezosa) dentro del `Shell`.
- `app.config.ts` — providers globales: router y `HttpClient` con los
  interceptores de `core/interceptors`.

La regla de dependencia es la misma que en el backend: un módulo de
`features` no importa de otro módulo de `features` directamente; lo común
sube a `shared/` o `core/`.
