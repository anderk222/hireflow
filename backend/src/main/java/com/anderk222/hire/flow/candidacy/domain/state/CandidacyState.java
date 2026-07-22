package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

/**
 * Patrón State: cada estado concreto sabe qué transiciones son válidas
 * desde sí mismo y devuelve el siguiente estado. Las transiciones
 * inválidas lanzan excepción por defecto, así que un estado nuevo solo
 * necesita sobrescribir las que sí permite (Open/Closed Principle: agregar
 * un estado nunca obliga a editar los demás).
 */
public interface CandidacyState {

    CandidacyStatus status();

    default CandidacyState startReview() {
        throw invalidTransition("startReview");
    }

    default CandidacyState shortlist() {
        throw invalidTransition("shortlist");
    }

    default CandidacyState scheduleInterview() {
        throw invalidTransition("scheduleInterview");
    }

    default CandidacyState markEvaluated() {
        throw invalidTransition("markEvaluated");
    }

    default CandidacyState select() {
        throw invalidTransition("select");
    }

    default CandidacyState hire() {
        throw invalidTransition("hire");
    }

    default CandidacyState reject() {
        throw invalidTransition("reject");
    }

    private IllegalStateException invalidTransition(String action) {
        return new IllegalStateException("Cannot '%s' a candidacy in status %s".formatted(action, status()));
    }
}
