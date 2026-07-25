package com.anderk222.hire.flow.evaluation.domain.model;

import com.anderk222.hire.flow.interview.domain.model.InterviewId;
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

    private EvaluationId id;
    private InterviewId interviewId;
    private EvaluationType type;
    private List<EvaluationCriterionScore> scores;
    private String observations;
    private EvaluationResult result;
}
