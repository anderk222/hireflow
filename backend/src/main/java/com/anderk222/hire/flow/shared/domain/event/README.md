# shared / domain / event

Contrato `DomainEvent` (patrón Observer): un módulo productor publica un
evento (p. ej. `InterviewScheduledEvent` en `interview`) y los módulos
interesados (p. ej. `notification`) reaccionan mediante un `@EventListener`,
sin que el productor conozca a sus observadores (Principio de Inversión de
Dependencias).
