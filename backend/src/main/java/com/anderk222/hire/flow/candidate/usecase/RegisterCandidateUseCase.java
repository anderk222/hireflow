package com.anderk222.hire.flow.candidate.usecase;

import com.anderk222.hire.flow.candidate.usecase.dto.command.RegisterCandidateCommand;
import com.anderk222.hire.flow.candidate.usecase.dto.response.CandidateResponse;

/**
 * Registra un candidato, o devuelve el existente para un aplicante
 * recurrente (FA en CU-02: "el candidato ya tiene una cuenta").
 */
public interface RegisterCandidateUseCase {

    CandidateResponse register(RegisterCandidateCommand command);
}
