package com.anderk222.hire.flow.notification.domain;

import com.anderk222.hire.flow.notification.domain.model.Notification;
import com.anderk222.hire.flow.notification.domain.model.NotificationId;

import java.util.List;
import java.util.Optional;

public interface NotificationRepository {

    Notification save(Notification notification);

    Optional<Notification> findById(NotificationId id);

    List<Notification> findPending();
}
