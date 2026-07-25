package com.anderk222.hire.flow.hiring.domain.model;

public record JobOfferId(Long value) {

    public JobOfferId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static JobOfferId of(Long value) {
        return new JobOfferId(value);
    }

    public static JobOfferId of(String value) {
        return new JobOfferId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
