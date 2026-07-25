package com.anderk222.hire.flow.notification.web;

import com.anderk222.hire.flow.notification.domain.model.NotificationId;
import com.anderk222.hire.flow.notification.usecase.GetNotificationUseCase;
import com.anderk222.hire.flow.notification.usecase.dto.response.NotificationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Las notificaciones no se crean directamente vía HTTP — las dispara un
 * evento de dominio (ver {@code notification/listener}). Este controlador
 * solo expone lectura, p. ej. para una futura vista administrativa de
 * "notificaciones pendientes".
 */
@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final GetNotificationUseCase getNotificationUseCase;

    @GetMapping("/{id}")
    public NotificationResponse getById(@PathVariable Long id) {
        return getNotificationUseCase.getById(NotificationId.of(id));
    }
}
