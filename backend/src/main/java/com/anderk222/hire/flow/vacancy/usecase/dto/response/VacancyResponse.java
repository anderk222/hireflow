package com.anderk222.hire.flow.vacancy.usecase.dto.response;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyStatus;
import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;

import java.time.LocalDate;
import java.util.List;

/** Detalle completo de una vacante, expuesto por el adaptador web. */
public record VacancyResponse(
        Long id,
        String title,
        String description,
        List<String> requirements,
        int totalSlots,
        int availableSlots,
        String location,
        WorkMode workMode,
        LocalDate applicationDeadline,
        VacancyStatus status
) {
}
