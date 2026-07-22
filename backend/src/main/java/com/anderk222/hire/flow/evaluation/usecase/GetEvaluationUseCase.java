package com.anderk222.hire.flow.evaluation.usecase;

import com.anderk222.hire.flow.evaluation.usecase.dto.response.EvaluationResponse;

public interface GetEvaluationUseCase {

    EvaluationResponse getById(Long id);
}
