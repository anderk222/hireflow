package com.anderk222.hire.flow.notification.service;

import com.anderk222.hire.flow.notification.domain.NotificationRepository;
import com.anderk222.hire.flow.notification.domain.NotificationSender;
import com.anderk222.hire.flow.notification.domain.model.NotificationId;
import com.anderk222.hire.flow.notification.usecase.GetNotificationUseCase;
import com.anderk222.hire.flow.notification.usecase.ScheduleInterviewReminderUseCase;
import com.anderk222.hire.flow.notification.usecase.SendInterviewConfirmationUseCase;
import com.anderk222.hire.flow.notification.usecase.dto.command.ScheduleInterviewReminderCommand;
import com.anderk222.hire.flow.notification.usecase.dto.command.SendInterviewConfirmationCommand;
import com.anderk222.hire.flow.notification.usecase.dto.response.NotificationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService implements SendInterviewConfirmationUseCase, ScheduleInterviewReminderUseCase,
        GetNotificationUseCase {

    private final NotificationRepository notificationRepository;
    private final NotificationSender notificationSender;

    @Override
    public void sendConfirmation(SendInterviewConfirmationCommand command) {
        // TODO: construir una Notification por destinatario, guardarla, llamar notificationSender.send(...).
        // Ante una falla (FE en CU-05): capturarla, dejar la notificación PENDING y agendar un reintento.
        throw new UnsupportedOperationException("TODO: implement sendConfirmation use case");
    }

    @Override
    public void schedule(ScheduleInterviewReminderCommand command) {
        // TODO: persistir una Notification de tipo INTERVIEW_REMINDER para remindAt y
        // dejar que un job agendado la recoja y llame notificationSender.send(...).
        throw new UnsupportedOperationException("TODO: implement schedule use case");
    }

    @Override
    public NotificationResponse getById(NotificationId id) {
        // TODO: notificationRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
