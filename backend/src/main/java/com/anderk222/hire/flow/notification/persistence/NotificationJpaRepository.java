package com.anderk222.hire.flow.notification.persistence;

import com.anderk222.hire.flow.notification.domain.model.NotificationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationJpaRepository extends JpaRepository<NotificationJpaEntity, Long> {

    List<NotificationJpaEntity> findByStatus(NotificationStatus status);
}
