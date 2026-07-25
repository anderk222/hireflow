package com.anderk222.hire.flow.candidacy.domain;

import com.anderk222.hire.flow.candidacy.domain.model.Candidacy;
import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.candidate.domain.model.CandidateId;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;

import java.util.List;
import java.util.Optional;

public interface CandidacyRepository {

    Candidacy save(Candidacy candidacy);

    Optional<Candidacy> findById(CandidacyId id);

    List<Candidacy> findByVacancyId(VacancyId vacancyId);

    boolean existsByVacancyIdAndCandidateId(VacancyId vacancyId, CandidateId candidateId);
}
