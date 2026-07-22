package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

public class UnderReviewState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.UNDER_REVIEW;
    }

    @Override
    public CandidacyState shortlist() {
        return new ShortlistedState();
    }

    @Override
    public CandidacyState reject() {
        return new RejectedState();
    }
}
