package com.anderk222.hire.flow.shared.domain.exception;

/**
 * Excepción base para violaciones de reglas de negocio dentro del dominio.
 * Cada módulo debe extenderla con excepciones específicas
 * (p. ej. VacancyClosedException, DuplicateCandidacyException).
 */
public abstract class DomainException extends RuntimeException {

    protected DomainException(String message) {
        super(message);
    }
}
