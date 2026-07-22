package com.anderk222.hire.flow.evaluation.domain.strategy;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationResult;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;
import org.springframework.stereotype.Component;

import java.util.List;

/** Pondera encaje de equipo y criterios específicos del rol definidos por el hiring manager. */
@Component
public class HiringManagerEvaluationStrategy implements EvaluationStrategy {

    @Override
    public boolean supports(EvaluationType type) {
        return type == EvaluationType.HIRING_MANAGER;
    }

    @Override
    public EvaluationResult evaluate(List<EvaluationCriterionScore> scores, String observations) {
        // TODO: calcular overallScore/recommendation con ponderación específica del hiring manager.
        throw new UnsupportedOperationException("TODO: implement hiring manager evaluation strategy");
    }
}
