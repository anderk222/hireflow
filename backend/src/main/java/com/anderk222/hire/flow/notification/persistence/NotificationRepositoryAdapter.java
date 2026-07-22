package com.anderk222.hire.flow.notification.persistence;

import com.anderk222.hire.flow.notification.domain.NotificationRepository;
import com.anderk222.hire.flow.notification.domain.model.Notification;
import com.anderk222.hire.flow.notification.domain.model.NotificationStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class NotificationRepositoryAdapter implements NotificationRepository {

    private final NotificationJpaRepository jpaRepository;

    @Override
    public Notification save(Notification notification) {
        // TODO: mapear Notification -> NotificationJpaEntity, guardar, mapear de vuelta a Notification.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Notification> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    @Override
    public List<Notification> findPending() {
        // TODO: jpaRepository.findByStatus(NotificationStatus.PENDING).stream().map(this::toDomain).toList()
        throw new UnsupportedOperationException("TODO: implement findPending");
    }
}
