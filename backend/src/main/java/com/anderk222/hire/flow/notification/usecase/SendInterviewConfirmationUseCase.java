package com.anderk222.hire.flow.notification.usecase;

import com.anderk222.hire.flow.notification.usecase.dto.command.SendInterviewConfirmationCommand;

/**
 * Caso de uso disparado por {@code InterviewScheduledListener} (patrón
 * Observer). Obligatorio según CU-05: todo participante debe ser notificado.
 */
public interface SendInterviewConfirmationUseCase {

    void sendConfirmation(SendInterviewConfirmationCommand command);
}
