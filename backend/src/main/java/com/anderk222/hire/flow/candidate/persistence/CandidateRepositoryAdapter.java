package com.anderk222.hire.flow.candidate.persistence;

import com.anderk222.hire.flow.candidate.domain.CandidateRepository;
import com.anderk222.hire.flow.candidate.domain.model.Candidate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CandidateRepositoryAdapter implements CandidateRepository {

    private final CandidateJpaRepository jpaRepository;

    @Override
    public Candidate save(Candidate candidate) {
        // TODO: mapear Candidate -> CandidateJpaEntity, guardar, mapear de vuelta a Candidate.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Candidate> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    @Override
    public Optional<Candidate> findByEmail(String email) {
        // TODO: jpaRepository.findByEmail(email).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findByEmail");
    }
}
