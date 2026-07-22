# evaluation / domain / strategy

Implementación del **patrón Strategy**: cómo se calcula un
`EvaluationResult` varía según el tipo de entrevista. `EvaluationService`
pregunta "quién soporta este tipo" (`supports`) y delega en esa estrategia,
así que agregar un tipo nuevo solo implica agregar una implementación
nueva (Open/Closed Principle) en vez de editar un condicional existente.

- `HrEvaluationStrategy` — criterios blandos / cultura, para el filtro
  inicial de RR.HH.
- `TechnicalEvaluationStrategy` — criterios técnicos (código, diseño de
  sistemas, etc.).
- `HiringManagerEvaluationStrategy` — criterios de encaje de equipo y
  específicos del rol.
