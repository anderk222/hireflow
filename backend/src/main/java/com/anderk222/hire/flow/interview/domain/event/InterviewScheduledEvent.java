package com.anderk222.hire.flow.interview.domain.event;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.interview.domain.model.InterviewId;
import com.anderk222.hire.flow.shared.domain.event.DomainEvent;

import java.time.Instant;
import java.util.List;

/**
 * Se publica justo después de agendar una entrevista. Este es el lado
 * productor del patrón Observer: `notification` se suscribe a este evento
 * para enviar la confirmación obligatoria (inclusión en el diagrama de
 * casos de uso) y, opcionalmente, agendar un recordatorio.
 */
public record InterviewScheduledEvent(
        InterviewId interviewId,
        CandidacyId candidacyId,
        List<Long> participantIds,
        Instant scheduledAt,
        boolean reminderEnabled,
        Instant occurredOn
) implements DomainEvent {
}
