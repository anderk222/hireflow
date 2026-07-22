package com.anderk222.hire.flow.candidacy.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidacyJpaRepository extends JpaRepository<CandidacyJpaEntity, Long> {

    List<CandidacyJpaEntity> findByVacancyId(Long vacancyId);

    boolean existsByVacancyIdAndCandidateId(Long vacancyId, Long candidateId);
}
