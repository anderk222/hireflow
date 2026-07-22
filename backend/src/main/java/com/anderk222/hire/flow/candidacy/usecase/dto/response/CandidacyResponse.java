package com.anderk222.hire.flow.candidacy.usecase.dto.response;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

import java.time.Instant;

public record CandidacyResponse(
        Long id,
        Long vacancyId,
        Long candidateId,
        CandidacyStatus status,
        String recruiterNotes,
        Instant appliedAt
) {
}
