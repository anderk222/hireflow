package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

public class InterviewScheduledState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.INTERVIEW_SCHEDULED;
    }

    @Override
    public CandidacyState markEvaluated() {
        return new EvaluatedState();
    }

    @Override
    public CandidacyState reject() {
        return new RejectedState();
    }
}
