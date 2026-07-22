package com.anderk222.hire.flow.notification.usecase.dto.response;

import com.anderk222.hire.flow.notification.domain.model.NotificationStatus;
import com.anderk222.hire.flow.notification.domain.model.NotificationType;

public record NotificationResponse(
        Long id,
        Long recipientId,
        NotificationType type,
        NotificationStatus status
) {
}
