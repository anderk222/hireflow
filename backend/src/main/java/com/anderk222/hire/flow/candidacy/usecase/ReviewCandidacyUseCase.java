package com.anderk222.hire.flow.candidacy.usecase;

import com.anderk222.hire.flow.candidacy.usecase.dto.command.ReviewDecisionCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;

import java.util.List;

/** Caso de uso CU-04: listar postulaciones de una vacante y decidir sobre ellas. */
public interface ReviewCandidacyUseCase {

    List<CandidacyResponse> listByVacancy(Long vacancyId);

    CandidacyResponse review(Long candidacyId, ReviewDecisionCommand decision);
}
