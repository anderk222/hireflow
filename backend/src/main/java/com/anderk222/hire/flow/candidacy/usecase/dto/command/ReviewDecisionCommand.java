package com.anderk222.hire.flow.candidacy.usecase.dto.command;

/** CU-04: decisión del reclutador tras revisar una postulación. */
public record ReviewDecisionCommand(
        ReviewDecision decision,
        String notes
) {
    public enum ReviewDecision {
        SHORTLIST,
        REJECT
    }
}
