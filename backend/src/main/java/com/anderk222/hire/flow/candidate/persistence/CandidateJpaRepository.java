package com.anderk222.hire.flow.candidate.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CandidateJpaRepository extends JpaRepository<CandidateJpaEntity, Long> {

    Optional<CandidateJpaEntity> findByEmail(String email);
}
