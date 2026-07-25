package com.anderk222.hire.flow.notification.domain.model;

public record NotificationId(Long value) {

    public NotificationId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static NotificationId of(Long value) {
        return new NotificationId(value);
    }

    public static NotificationId of(String value) {
        return new NotificationId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
