package com.anderk222.hire.flow.vacancy.usecase.dto.response;

import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;

/** CU-01: fila mostrada en el listado público de vacantes. */
public record VacancySummaryResponse(
        Long id,
        String title,
        String location,
        WorkMode workMode
) {
}
