package com.anderk222.hire.flow.interview.persistence;

import com.anderk222.hire.flow.interview.domain.InterviewRepository;
import com.anderk222.hire.flow.interview.domain.model.Interview;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class InterviewRepositoryAdapter implements InterviewRepository {

    private final InterviewJpaRepository jpaRepository;

    @Override
    public Interview save(Interview interview) {
        // TODO: mapear Interview -> InterviewJpaEntity, guardar, mapear de vuelta a Interview.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Interview> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }
}
