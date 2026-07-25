package com.anderk222.hire.flow.vacancy.persistence;

import com.anderk222.hire.flow.vacancy.domain.VacancyRepository;
import com.anderk222.hire.flow.vacancy.domain.model.Vacancy;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Implementa el contrato de dominio {@link VacancyRepository} sobre Spring
 * Data JPA. El mapeo entre {@link Vacancy} y {@link VacancyJpaEntity} queda
 * como TODO — en una implementación real podría ser un mapper dedicado.
 */
@Component
@RequiredArgsConstructor
public class VacancyRepositoryAdapter implements VacancyRepository {

    private final VacancyJpaRepository jpaRepository;

    @Override
    public Vacancy save(Vacancy vacancy) {
        // TODO: mapear Vacancy -> VacancyJpaEntity, guardar, mapear de vuelta a Vacancy.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Vacancy> findById(VacancyId id) {
        // TODO: jpaRepository.findById(id.value()).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    @Override
    public List<Vacancy> findOpen() {
        // TODO: jpaRepository.findByStatus(VacancyStatus.PUBLISHED).stream().map(this::toDomain).toList()
        throw new UnsupportedOperationException("TODO: implement findOpen");
    }
}
