package com.anderk222.hire.flow.evaluation.domain.strategy;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationCriterionScore;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationResult;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;

import java.util.List;

/**
 * Patrón Strategy: cómo se calcula un {@link EvaluationResult} varía según
 * el tipo de entrevista. {@code EvaluationService} pregunta "quién soporta
 * este tipo" y delega en esa estrategia, así que agregar un tipo nuevo
 * solo implica agregar una implementación (Open/Closed Principle) en vez
 * de editar un condicional.
 */
public interface EvaluationStrategy {

    boolean supports(EvaluationType type);

    EvaluationResult evaluate(List<EvaluationCriterionScore> scores, String observations);
}
