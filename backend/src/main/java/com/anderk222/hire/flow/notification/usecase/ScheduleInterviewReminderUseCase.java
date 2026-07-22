package com.anderk222.hire.flow.notification.usecase;

import com.anderk222.hire.flow.notification.usecase.dto.command.ScheduleInterviewReminderCommand;

/** Caso de uso para el recordatorio opcional (FA en CU-05: el reclutador puede desactivarlo). */
public interface ScheduleInterviewReminderUseCase {

    void schedule(ScheduleInterviewReminderCommand command);
}
