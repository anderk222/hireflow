package com.anderk222.hire.flow.candidate.domain.model;

public record CandidateId(Long value) {

    public CandidateId {
        if (value == null) {
            throw new NullPointerException("value must not be null");
        }
    }

    public static CandidateId of(Long value) {
        return new CandidateId(value);
    }

    public static CandidateId of(String value) {
        return new CandidateId(Long.valueOf(value));
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
