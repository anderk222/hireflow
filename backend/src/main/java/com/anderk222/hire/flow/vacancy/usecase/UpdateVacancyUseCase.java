package com.anderk222.hire.flow.vacancy.usecase;

import com.anderk222.hire.flow.vacancy.usecase.dto.command.UpdateVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;

public interface UpdateVacancyUseCase {

    VacancyResponse update(Long id, UpdateVacancyCommand command);
}
