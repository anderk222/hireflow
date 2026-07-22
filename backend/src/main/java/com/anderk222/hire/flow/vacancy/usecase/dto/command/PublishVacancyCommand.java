package com.anderk222.hire.flow.vacancy.usecase.dto.command;

import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;

import java.time.LocalDate;
import java.util.List;

/** Comando de entrada para CU-03 (crear/publicar una vacante). */
public record PublishVacancyCommand(
        String title,
        String description,
        List<String> requirements,
        int slots,
        String location,
        WorkMode workMode,
        LocalDate applicationDeadline
) {
}
