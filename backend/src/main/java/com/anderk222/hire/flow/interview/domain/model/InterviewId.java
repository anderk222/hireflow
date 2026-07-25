package com.anderk222.hire.flow.interview.domain.model;

public record InterviewId(Long value) {

    public InterviewId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static InterviewId of(Long value) {
        return new InterviewId(value);
    }

    public static InterviewId of(String value) {
        return new InterviewId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
