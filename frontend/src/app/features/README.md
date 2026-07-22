# features

Un directorio por módulo de negocio, replicando el mismo recorte que el
backend (`vacancy`, `candidate`, `candidacy`, `interview`, `evaluation`,
`hiring`, `notification`) más `auth`, que no existe como módulo de negocio
en el backend pero sí como pantalla en el frontend.

Cada módulo sigue la misma forma interna:

- `models/` — interfaces TypeScript que espejan los DTOs del backend.
- `services/` — cliente HTTP hacia el controlador REST del módulo.
- `components/` — piezas de UI usadas solo dentro de este módulo.
- `pages/` — pantallas ruteables.
- `<modulo>.routes.ts` — rutas del módulo, cargadas de forma perezosa
  (`loadChildren`) desde `app.routes.ts`.

Un módulo de `features` no debe importar directamente de otro módulo de
`features` (evita el mismo acoplamiento que se busca prevenir en el
backend); si dos módulos necesitan compartir algo, ese "algo" va a
`shared/` o `core/`.
