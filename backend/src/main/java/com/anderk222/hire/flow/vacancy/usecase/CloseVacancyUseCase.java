package com.anderk222.hire.flow.vacancy.usecase;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;

public interface CloseVacancyUseCase {

    void close(VacancyId id);
}
