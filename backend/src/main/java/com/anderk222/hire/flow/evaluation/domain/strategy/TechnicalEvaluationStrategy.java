package com.anderk222.hire.flow.evaluation.domain.strategy;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationResult;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;
import org.springframework.stereotype.Component;

import java.util.List;

/** Pondera criterios técnicos (código, diseño de sistemas, etc.). */
@Component
public class TechnicalEvaluationStrategy implements EvaluationStrategy {

    @Override
    public boolean supports(EvaluationType type) {
        return type == EvaluationType.TECHNICAL;
    }

    @Override
    public EvaluationResult evaluate(List<EvaluationCriterionScore> scores, String observations) {
        // TODO: calcular overallScore/recommendation con ponderación técnica específica.
        throw new UnsupportedOperationException("TODO: implement technical evaluation strategy");
    }
}
