package com.anderk222.hire.flow.notification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

/** Entidad de dominio: un intento de notificación ligado a un destinatario. */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    private NotificationId id;
    private Long recipientId;
    private NotificationType type;
    private String message;
    private NotificationStatus status;
    private Instant sendAt;

    /** Se llama cuando el reintento tiene éxito. */
    public void markSent() {
        // TODO: validar transición desde PENDING, fijar status = SENT.
        throw new UnsupportedOperationException("TODO: implement markSent rule");
    }

    /** Se llama cuando el envío falla; un job agendado puede reintentar luego. */
    public void markFailed() {
        // TODO: fijar status = FAILED (o PENDING si quedan reintentos).
        throw new UnsupportedOperationException("TODO: implement markFailed rule");
    }
}
