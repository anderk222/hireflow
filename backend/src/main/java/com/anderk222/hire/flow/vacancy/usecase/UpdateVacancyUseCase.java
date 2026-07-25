package com.anderk222.hire.flow.vacancy.usecase;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.UpdateVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;

public interface UpdateVacancyUseCase {

    VacancyResponse update(VacancyId id, UpdateVacancyCommand command);
}
