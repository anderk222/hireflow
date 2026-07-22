package com.anderk222.hire.flow.candidate.usecase;

import com.anderk222.hire.flow.candidate.usecase.dto.response.CandidateResponse;

public interface GetCandidateUseCase {

    CandidateResponse getById(Long id);
}
