package com.anderk222.hire.flow.vacancy.service;

import com.anderk222.hire.flow.vacancy.domain.VacancyRepository;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import com.anderk222.hire.flow.vacancy.usecase.BrowseVacanciesUseCase;
import com.anderk222.hire.flow.vacancy.usecase.CloseVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.PublishVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.UpdateVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.PublishVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.UpdateVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.VacancyFilterCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancySummaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Orquesta los casos de uso de vacante. No contiene reglas de negocio
 * propias (esas viven en {@link com.anderk222.hire.flow.vacancy.domain.model.Vacancy}),
 * solo coordina dominio + repositorio.
 */
@Service
@RequiredArgsConstructor
public class VacancyService implements PublishVacancyUseCase, UpdateVacancyUseCase,
        CloseVacancyUseCase, BrowseVacanciesUseCase {

    private final VacancyRepository vacancyRepository;

    @Override
    public VacancyResponse publish(PublishVacancyCommand command) {
        // TODO: mapear command -> Vacancy, llamar vacancy.publish(), guardar y mapear a response.
        throw new UnsupportedOperationException("TODO: implement publish use case");
    }

    @Override
    public VacancyResponse update(VacancyId id, UpdateVacancyCommand command) {
        // TODO: cargar vacante, aplicar cambios, guardar y mapear a response.
        throw new UnsupportedOperationException("TODO: implement update use case");
    }

    @Override
    public void close(VacancyId id) {
        // TODO: cargar vacante, llamar vacancy.close(), guardar.
        throw new UnsupportedOperationException("TODO: implement close use case");
    }

    @Override
    public List<VacancySummaryResponse> listOpen(VacancyFilterCommand filter) {
        // TODO: consultar vacancyRepository.findOpen() y aplicar el filtro, mapear a summaries.
        throw new UnsupportedOperationException("TODO: implement listOpen use case");
    }

    @Override
    public VacancyResponse getById(VacancyId id) {
        // TODO: vacancyRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
