package com.anderk222.hire.flow.candidacy.domain.model;

import com.anderk222.hire.flow.candidacy.domain.state.CandidacyState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

/**
 * Entidad de dominio que enlaza un candidato con una vacante. Delega cada
 * transición de ciclo de vida al {@link CandidacyState} actual (patrón
 * State) en lugar de tener un condicional gigante. No lleva
 * `@NoArgsConstructor` de Lombok a propósito: sus campos finales exigen
 * que siempre se construya con estado inicial.
 */
@Getter
@AllArgsConstructor
@Builder
public class Candidacy {

    private Long id;
    private final Long vacancyId;
    private final Long candidateId;
    private CandidacyState state;
    private String recruiterNotes;
    private final Instant appliedAt;

    public void startReview() {
        this.state = state.startReview();
    }

    public void shortlist(String notes) {
        this.state = state.shortlist();
        this.recruiterNotes = notes;
    }

    public void reject(String notes) {
        this.state = state.reject();
        this.recruiterNotes = notes;
    }

    public void scheduleInterview() {
        this.state = state.scheduleInterview();
    }

    public void markEvaluated() {
        this.state = state.markEvaluated();
    }

    public void select() {
        this.state = state.select();
    }

    public void hire() {
        this.state = state.hire();
    }

    public CandidacyStatus getStatus() {
        return state.status();
    }
}
