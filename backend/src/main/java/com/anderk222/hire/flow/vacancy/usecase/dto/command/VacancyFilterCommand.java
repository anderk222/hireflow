package com.anderk222.hire.flow.vacancy.usecase.dto.command;

import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;

/** CU-01: filtros opcionales para el listado público de vacantes. */
public record VacancyFilterCommand(
        String area,
        WorkMode workMode,
        String location
) {
}
