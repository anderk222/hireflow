package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

/** Estado terminal: no se permiten más transiciones. */
public class HiredState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.HIRED;
    }
}
