package com.anderk222.hire.flow.notification.listener;

import com.anderk222.hire.flow.interview.domain.event.InterviewScheduledEvent;
import com.anderk222.hire.flow.notification.usecase.ScheduleInterviewReminderUseCase;
import com.anderk222.hire.flow.notification.usecase.SendInterviewConfirmationUseCase;
import com.anderk222.hire.flow.notification.usecase.dto.command.ScheduleInterviewReminderCommand;
import com.anderk222.hire.flow.notification.usecase.dto.command.SendInterviewConfirmationCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Lado observador del patrón: reacciona a {@link InterviewScheduledEvent}
 * publicado por el módulo `interview`. `interview` no sabe que esta clase
 * existe, que es justamente el punto (Dependency Inversion Principle).
 */
@Component
@RequiredArgsConstructor
public class InterviewScheduledListener {

    private final SendInterviewConfirmationUseCase sendInterviewConfirmationUseCase;
    private final ScheduleInterviewReminderUseCase scheduleInterviewReminderUseCase;

    @EventListener
    public void onInterviewScheduled(InterviewScheduledEvent event) {
        sendInterviewConfirmationUseCase.sendConfirmation(new SendInterviewConfirmationCommand(
                event.interviewId(), event.participantIds(), event.scheduledAt()
        ));

        if (event.reminderEnabled()) {
            // TODO: calcular remindAt (p. ej. 24h antes de scheduledAt) en vez de reusar scheduledAt.
            scheduleInterviewReminderUseCase.schedule(new ScheduleInterviewReminderCommand(
                    event.interviewId(), event.participantIds(), event.scheduledAt()
            ));
        }
    }
}
