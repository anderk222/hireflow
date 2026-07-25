package com.anderk222.hire.flow.vacancy.domain.model;

public record VacancyId(Long value) {

    public VacancyId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static VacancyId of(Long value) {
        return new VacancyId(value);
    }

    public static VacancyId of(String value) {
        return new VacancyId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
