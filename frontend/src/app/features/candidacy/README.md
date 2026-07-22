# features / candidacy

Postulaciones (Candidacy): CU-02 (postularse) y CU-04 (revisar
postulaciones). El estado (`RECEIVED`, `UNDER_REVIEW`, `SHORTLISTED`, ...)
espeja el enum `CandidacyStatus` del backend, cuyas transiciones están
gobernadas por el patrón State en el módulo `candidacy` del backend — el
frontend solo muestra el estado y envía la decisión, no calcula
transiciones.

- `pages/candidacy-review` — pantalla del reclutador para revisar
  postulaciones de una vacante (CU-04).
