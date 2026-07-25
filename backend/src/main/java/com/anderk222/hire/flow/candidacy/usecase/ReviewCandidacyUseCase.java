package com.anderk222.hire.flow.candidacy.usecase;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.candidacy.usecase.dto.command.ReviewDecisionCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;

import java.util.List;

/** Caso de uso CU-04: listar postulaciones de una vacante y decidir sobre ellas. */
public interface ReviewCandidacyUseCase {

    List<CandidacyResponse> listByVacancy(VacancyId vacancyId);

    CandidacyResponse review(CandidacyId candidacyId, ReviewDecisionCommand decision);
}
