package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

public class EvaluatedState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.EVALUATED;
    }

    @Override
    public CandidacyState select() {
        return new SelectedState();
    }

    @Override
    public CandidacyState reject() {
        return new RejectedState();
    }
}
