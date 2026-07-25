package com.anderk222.hire.flow.evaluation.domain;

import com.anderk222.hire.flow.evaluation.domain.model.Evaluation;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationId;

import java.util.Optional;

public interface EvaluationRepository {

    Evaluation save(Evaluation evaluation);

    Optional<Evaluation> findById(EvaluationId id);
}
