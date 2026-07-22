package com.anderk222.hire.flow.candidacy.usecase;

import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;

public interface GetCandidacyUseCase {

    CandidacyResponse getById(Long id);
}
