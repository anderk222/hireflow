package com.anderk222.hire.flow.evaluation.domain.model;

/** CU-06: un criterio puntuado (p. ej. "resolución de problemas" -> 8). */
public record EvaluationCriterionScore(
        String criterion,
        int score
) {
}
