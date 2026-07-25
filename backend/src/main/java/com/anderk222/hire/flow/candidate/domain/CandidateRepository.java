package com.anderk222.hire.flow.candidate.domain;

import com.anderk222.hire.flow.candidate.domain.model.Candidate;
import com.anderk222.hire.flow.candidate.domain.model.CandidateId;

import java.util.Optional;

public interface CandidateRepository {

    Candidate save(Candidate candidate);

    Optional<Candidate> findById(CandidateId id);

    Optional<Candidate> findByEmail(String email);
}
