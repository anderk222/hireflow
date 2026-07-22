# shared

Piezas de UI reutilizables **entre distintos módulos de negocio**, sin
lógica de negocio propia: componentes "tontos" (presentacionales), pipes y
directivas genéricas.

Si un componente solo lo usa un módulo, va dentro de ese
`features/<modulo>/components`, no aquí. `shared` es para lo que se repite
en 2+ módulos (p. ej. un spinner de carga, un badge de estado).
