package com.anderk222.hire.flow.hiring.usecase.dto.command;

import java.time.LocalDate;

/** CU-07: datos que llena el reclutador para generar una oferta a un candidato seleccionado. */
public record GenerateJobOfferCommand(
        Long candidacyId,
        double salary,
        String position,
        String workMode,
        LocalDate startDate
) {
}
