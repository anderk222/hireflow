package com.anderk222.hire.flow.notification.domain.model;

/**
 * FE en CU-05: si el proveedor de notificaciones no está disponible, la
 * entrevista se registra igual pero la notificación queda PENDING y se
 * agenda un reintento en vez de fallar todo el caso de uso.
 */
public enum NotificationStatus {
    SENT,
    PENDING,
    FAILED
}
