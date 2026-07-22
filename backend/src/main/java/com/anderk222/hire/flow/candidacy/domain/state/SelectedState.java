package com.anderk222.hire.flow.candidacy.domain.state;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;

/** CU-07: se alcanza una vez enviada la oferta laboral, a la espera de la respuesta del candidato. */
public class SelectedState implements CandidacyState {

    @Override
    public CandidacyStatus status() {
        return CandidacyStatus.SELECTED;
    }

    @Override
    public CandidacyState hire() {
        return new HiredState();
    }

    @Override
    public CandidacyState reject() {
        // FE en CU-07: el candidato rechaza la oferta.
        return new RejectedState();
    }
}
