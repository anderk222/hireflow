package com.anderk222.hire.flow.vacancy.domain.model;

/** Ciclo de vida simple de una vacante (3 estados fijos; no amerita patrón State). */
public enum VacancyStatus {
    DRAFT,
    PUBLISHED,
    CLOSED
}
