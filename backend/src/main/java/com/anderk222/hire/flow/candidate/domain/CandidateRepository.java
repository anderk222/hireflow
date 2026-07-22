package com.anderk222.hire.flow.candidate.domain;

import com.anderk222.hire.flow.candidate.domain.model.Candidate;

import java.util.Optional;

public interface CandidateRepository {

    Candidate save(Candidate candidate);

    Optional<Candidate> findById(Long id);

    Optional<Candidate> findByEmail(String email);
}
