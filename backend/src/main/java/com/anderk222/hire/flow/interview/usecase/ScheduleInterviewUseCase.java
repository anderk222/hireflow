package com.anderk222.hire.flow.interview.usecase;

import com.anderk222.hire.flow.interview.usecase.dto.command.ScheduleInterviewCommand;
import com.anderk222.hire.flow.interview.usecase.dto.response.InterviewResponse;

/**
 * Caso de uso CU-05. La implementación debe: verificar la disponibilidad
 * de los participantes, persistir la entrevista, mover la postulación
 * enlazada a INTERVIEW_SCHEDULED y publicar {@code InterviewScheduledEvent}
 * para que `notification` envíe la confirmación obligatoria.
 */
public interface ScheduleInterviewUseCase {

    InterviewResponse schedule(ScheduleInterviewCommand command);
}
