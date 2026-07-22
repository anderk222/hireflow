package com.anderk222.hire.flow.vacancy.usecase.dto.command;

import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;

import java.time.LocalDate;
import java.util.List;

/** Comando de entrada para editar una vacante existente. */
public record UpdateVacancyCommand(
        String title,
        String description,
        List<String> requirements,
        String location,
        WorkMode workMode,
        LocalDate applicationDeadline
) {
}
