package com.anderk222.hire.flow.evaluation.persistence;

import com.anderk222.hire.flow.evaluation.domain.EvaluationRepository;
import com.anderk222.hire.flow.evaluation.domain.model.Evaluation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EvaluationRepositoryAdapter implements EvaluationRepository {

    private final EvaluationJpaRepository jpaRepository;

    @Override
    public Evaluation save(Evaluation evaluation) {
        // TODO: mapear Evaluation -> EvaluationJpaEntity, guardar, mapear de vuelta a Evaluation.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Evaluation> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }
}
