package com.anderk222.hire.flow.candidacy.domain;

import com.anderk222.hire.flow.candidacy.domain.model.Candidacy;

import java.util.List;
import java.util.Optional;

public interface CandidacyRepository {

    Candidacy save(Candidacy candidacy);

    Optional<Candidacy> findById(Long id);

    List<Candidacy> findByVacancyId(Long vacancyId);

    boolean existsByVacancyIdAndCandidateId(Long vacancyId, Long candidateId);
}
