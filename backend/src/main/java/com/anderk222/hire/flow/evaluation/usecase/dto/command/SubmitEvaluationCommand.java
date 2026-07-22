package com.anderk222.hire.flow.evaluation.usecase.dto.command;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;

import java.util.List;

/** CU-06: criterios puntuados y observaciones registradas por el evaluador. */
public record SubmitEvaluationCommand(
        Long interviewId,
        EvaluationType type,
        List<EvaluationCriterionScore> scores,
        String observations
) {
}
