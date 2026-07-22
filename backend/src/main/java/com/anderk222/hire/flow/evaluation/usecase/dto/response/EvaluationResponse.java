package com.anderk222.hire.flow.evaluation.usecase.dto.response;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;
import com.anderk222.hire.flow.evaluation.domain.model.Recommendation;

import java.util.List;

public record EvaluationResponse(
        Long id,
        Long interviewId,
        EvaluationType type,
        List<EvaluationCriterionScore> scores,
        String observations,
        double overallScore,
        Recommendation recommendation
) {
}
