# interview / domain / event

Lado productor del **patrón Observer**: `InterviewScheduledEvent` se
publica justo después de agendar una entrevista, implementando el
contrato `DomainEvent` de `shared`. El módulo `notification` se suscribe a
este evento (ver `notification/listener`) para enviar la confirmación
obligatoria y, opcionalmente, agendar un recordatorio — sin que
`interview` sepa que `notification` existe (Principio de Inversión de
Dependencias).
