package com.anderk222.hire.flow.vacancy.domain;

import com.anderk222.hire.flow.vacancy.domain.model.Vacancy;

import java.util.List;
import java.util.Optional;

/** Contrato de persistencia del módulo. Lo implementa {@code persistence.VacancyRepositoryAdapter}. */
public interface VacancyRepository {

    Vacancy save(Vacancy vacancy);

    Optional<Vacancy> findById(Long id);

    List<Vacancy> findOpen();
}
