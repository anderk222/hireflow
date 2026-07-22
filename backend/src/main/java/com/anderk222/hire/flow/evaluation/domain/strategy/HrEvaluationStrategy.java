package com.anderk222.hire.flow.evaluation.domain.strategy;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationResult;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;
import org.springframework.stereotype.Component;

import java.util.List;

/** Pondera criterios blandos / de cultura para el filtro inicial de RR.HH. */
@Component
public class HrEvaluationStrategy implements EvaluationStrategy {

    @Override
    public boolean supports(EvaluationType type) {
        return type == EvaluationType.HR;
    }

    @Override
    public EvaluationResult evaluate(List<EvaluationCriterionScore> scores, String observations) {
        // TODO: calcular overallScore/recommendation con ponderación específica de RR.HH.
        throw new UnsupportedOperationException("TODO: implement HR evaluation strategy");
    }
}
