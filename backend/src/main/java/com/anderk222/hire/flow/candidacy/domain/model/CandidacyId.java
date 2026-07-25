package com.anderk222.hire.flow.candidacy.domain.model;

public record CandidacyId(Long value) {

    public CandidacyId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static CandidacyId of(Long value) {
        return new CandidacyId(value);
    }

    public static CandidacyId of(String value) {
        return new CandidacyId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
