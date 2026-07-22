# shared

Núcleo transversal del monolito modular. No es un módulo de negocio: aquí
solo vive lo que **todos** los módulos necesitan y que no tiene dueño
natural en ninguno de ellos en particular.

- `domain/exception` — jerarquía base de excepciones de negocio.
- `domain/event` — contrato de evento de dominio (patrón Observer).
- `exception` — excepción de validación de entrada (capa de casos de uso).
- `web` — formato de error HTTP y su manejador global.

Regla: nada aquí depende de un módulo de negocio (`vacancy`, `candidacy`,
etc.). La dependencia va siempre en un solo sentido: los módulos dependen
de `shared`, nunca al revés.
