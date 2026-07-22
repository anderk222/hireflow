# features / vacancy

Módulo de vacantes (Vacancy) en el frontend: CU-01 (consulta pública) y
CU-03 (gestión por el reclutador). Es el módulo más completo del cascaron
del frontend, a modo de ejemplo de cómo se arma un feature de punta a
punta; el resto de los módulos siguen la misma forma con menos detalle.

- `models/` — interfaces TypeScript que espejan los DTOs del backend
  (`vacancy` module).
- `services/` — cliente HTTP hacia `/api/vacancies`.
- `components/` — piezas de UI reutilizadas dentro de este módulo.
- `pages/` — pantallas ruteables (listado y detalle).
- `vacancy.routes.ts` — rutas del módulo, cargadas de forma perezosa desde
  `app.routes.ts`.
