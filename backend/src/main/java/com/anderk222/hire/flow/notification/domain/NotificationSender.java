package com.anderk222.hire.flow.notification.domain;

import com.anderk222.hire.flow.notification.domain.model.Notification;

/**
 * Contrato de salida para el envío efectivo de una notificación. Los
 * canales concretos (correo hoy, SMS/push mañana) implementan esta
 * interfaz en `email/` (o carpetas hermanas), así que los casos de uso
 * nunca dependen de un proveedor específico (Dependency Inversion
 * Principle).
 */
public interface NotificationSender {

    void send(Notification notification);
}
