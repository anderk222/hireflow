# features / candidate

Perfil del candidato (Candidate): datos personales, contacto y hoja de
vida. No tiene una pantalla propia en este cascaron — se consume desde el
flujo de postulación (`candidacy`) cuando un candidato aplica a una
vacante por primera vez (CU-02).

- `models/` — interfaz que espeja `CandidateResponse` del backend.
- `services/` — cliente HTTP hacia `/api/candidates`.
