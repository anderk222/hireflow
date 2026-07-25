package com.anderk222.hire.flow.notification.usecase;

import com.anderk222.hire.flow.notification.domain.model.NotificationId;
import com.anderk222.hire.flow.notification.usecase.dto.response.NotificationResponse;

public interface GetNotificationUseCase {

    NotificationResponse getById(NotificationId id);
}
