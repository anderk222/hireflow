package com.anderk222.hire.flow.interview.domain.exception;

import com.anderk222.hire.flow.shared.domain.exception.DomainException;

/**
 * Se lanza cuando al menos un participante ya tiene otra entrevista
 * agendada en el mismo horario (FE en CU-05).
 */
public class SchedulingConflictException extends DomainException {

    public SchedulingConflictException(Long participantId) {
        super("Participant %s already has an interview scheduled at that time".formatted(participantId));
    }
}
