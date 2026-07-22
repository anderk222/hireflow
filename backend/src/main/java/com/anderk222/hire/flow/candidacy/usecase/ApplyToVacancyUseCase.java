package com.anderk222.hire.flow.candidacy.usecase;

import com.anderk222.hire.flow.candidacy.usecase.dto.command.ApplyToVacancyCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;

/** Caso de uso CU-02: registrar una nueva postulación en estado RECEIVED. */
public interface ApplyToVacancyUseCase {

    CandidacyResponse apply(ApplyToVacancyCommand command);
}
