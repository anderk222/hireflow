package com.anderk222.hire.flow.candidate.usecase;

import com.anderk222.hire.flow.candidate.domain.model.CandidateId;
import com.anderk222.hire.flow.candidate.usecase.dto.response.CandidateResponse;

public interface GetCandidateUseCase {

    CandidateResponse getById(CandidateId id);
}
