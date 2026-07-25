package com.anderk222.hire.flow.candidacy.usecase;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;

public interface GetCandidacyUseCase {

    CandidacyResponse getById(CandidacyId id);
}
