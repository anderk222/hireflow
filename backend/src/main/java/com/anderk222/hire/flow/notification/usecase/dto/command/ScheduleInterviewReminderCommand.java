package com.anderk222.hire.flow.notification.usecase.dto.command;

import java.time.Instant;
import java.util.List;

public record ScheduleInterviewReminderCommand(
        Long interviewId,
        List<Long> recipientIds,
        Instant remindAt
) {
}
