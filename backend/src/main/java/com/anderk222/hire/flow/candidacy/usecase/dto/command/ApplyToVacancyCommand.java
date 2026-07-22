package com.anderk222.hire.flow.candidacy.usecase.dto.command;

/** CU-02: un candidato postula a una vacante. */
public record ApplyToVacancyCommand(
        Long vacancyId,
        Long candidateId
) {
}
