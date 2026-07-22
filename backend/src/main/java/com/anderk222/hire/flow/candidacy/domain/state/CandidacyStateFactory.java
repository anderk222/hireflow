package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

/**
 * Reconstruye la instancia correcta de {@link CandidacyState} a partir de
 * un {@link CandidacyStatus} persistido. Solo el adaptador de persistencia
 * debería necesitar esto.
 */
public final class CandidacyStateFactory {

    private CandidacyStateFactory() {
    }

    public static CandidacyState of(CandidacyStatus status) {
        return switch (status) {
            case RECEIVED -> new ReceivedState();
            case UNDER_REVIEW -> new UnderReviewState();
            case SHORTLISTED -> new ShortlistedState();
            case INTERVIEW_SCHEDULED -> new InterviewScheduledState();
            case EVALUATED -> new EvaluatedState();
            case SELECTED -> new SelectedState();
            case HIRED -> new HiredState();
            case REJECTED -> new RejectedState();
        };
    }
}
