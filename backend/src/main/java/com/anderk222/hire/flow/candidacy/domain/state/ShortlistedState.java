package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

public class ShortlistedState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.SHORTLISTED;
    }

    @Override
    public CandidacyState scheduleInterview() {
        return new InterviewScheduledState();
    }

    @Override
    public CandidacyState reject() {
        return new RejectedState();
    }
}
