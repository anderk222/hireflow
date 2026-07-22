package com.anderk222.hire.flow.evaluation.domain.model;

/** Resultado calculado por una {@code EvaluationStrategy} para una evaluación dada. */
public record EvaluationResult(
        double overallScore,
        Recommendation recommendation
) {
}
