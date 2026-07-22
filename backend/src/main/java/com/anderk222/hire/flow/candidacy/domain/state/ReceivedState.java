package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

public class ReceivedState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.RECEIVED;
    }

    @Override
    public CandidacyState startReview() {
        return new UnderReviewState();
    }

    @Override
    public CandidacyState reject() {
        return new RejectedState();
    }
}
