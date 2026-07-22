package com.anderk222.hire.flow.notification.email;

import com.anderk222.hire.flow.notification.domain.NotificationSender;
import com.anderk222.hire.flow.notification.domain.model.Notification;
import org.springframework.stereotype.Component;

/**
 * Implementación concreta de {@link NotificationSender} sobre correo
 * electrónico. Cambiar de canal (SMS, push) más adelante solo implica
 * agregar otra clase adaptadora aquí.
 */
@Component
public class EmailNotificationAdapter implements NotificationSender {

    @Override
    public void send(Notification notification) {
        // TODO: integrar con un mail sender (p. ej. JavaMailSender) y marcar
        // la notificación como enviada/fallida según corresponda.
        throw new UnsupportedOperationException("TODO: implement email delivery");
    }
}
