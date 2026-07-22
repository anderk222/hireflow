package com.anderk222.hire.flow.notification.usecase.dto.command;

import java.time.Instant;
import java.util.List;

/** Construido a partir de {@code InterviewScheduledEvent} por el listener, no se expone vía HTTP. */
public record SendInterviewConfirmationCommand(
        Long interviewId,
        List<Long> recipientIds,
        Instant scheduledAt
) {
}
