package com.anderk222.hire.flow.candidacy.domain.model;

/**
 * Valores del ciclo de vida de una postulación (ver la implementación del
 * patrón State en {@code domain.state}). Se deja como enum plano para que
 * sea fácil de persistir y exponer; las reglas de transición viven en las
 * clases de estado.
 */
public enum CandidacyStatus {
    RECEIVED,
    UNDER_REVIEW,
    SHORTLISTED,
    INTERVIEW_SCHEDULED,
    EVALUATED,
    SELECTED,
    HIRED,
    REJECTED
}
