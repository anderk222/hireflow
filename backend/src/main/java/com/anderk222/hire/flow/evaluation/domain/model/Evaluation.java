package com.anderk222.hire.flow.evaluation.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/** Entidad de dominio para CU-06: una evaluación registrada tras una entrevista. */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Evaluation {

    private Long id;
    private Long interviewId;
    private EvaluationType type;
    private List<EvaluationCriterionScore> scores;
    private String observations;
    private EvaluationResult result;
}
