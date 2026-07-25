package com.anderk222.hire.flow.vacancy.usecase;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.VacancyFilterCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancySummaryResponse;

import java.util.List;

/** Caso de uso CU-01: listado/búsqueda pública de vacantes abiertas. */
public interface BrowseVacanciesUseCase {

    List<VacancySummaryResponse> listOpen(VacancyFilterCommand filter);

    VacancyResponse getById(VacancyId id);
}
