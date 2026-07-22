package com.anderk222.hire.flow.vacancy.usecase;

import com.anderk222.hire.flow.vacancy.usecase.dto.command.PublishVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;

/** Caso de uso CU-03: crear y publicar una vacante. */
public interface PublishVacancyUseCase {

    VacancyResponse publish(PublishVacancyCommand command);
}
