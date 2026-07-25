package com.anderk222.hire.flow.evaluation.domain.model;

public record EvaluationId(Long value) {

    public EvaluationId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static EvaluationId of(Long value) {
        return new EvaluationId(value);
    }

    public static EvaluationId of(String value) {
        return new EvaluationId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
