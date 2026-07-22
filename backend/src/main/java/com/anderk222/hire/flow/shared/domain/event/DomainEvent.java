package com.anderk222.hire.flow.shared.domain.event;

import java.time.Instant;

/**
 * Contrato base para eventos de dominio (patrón Observer). Los módulos
 * productores publican eventos (p. ej. InterviewScheduledEvent) y los
 * módulos interesados (p. ej. notification) se suscriben sin acoplarse
 * directamente al módulo que los origina.
 */
public interface DomainEvent {

    Instant occurredOn();
}
