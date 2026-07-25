package com.anderk222.hire.flow.candidate.service;

import com.anderk222.hire.flow.candidate.domain.CandidateRepository;
import com.anderk222.hire.flow.candidate.domain.model.CandidateId;
import com.anderk222.hire.flow.candidate.usecase.GetCandidateUseCase;
import com.anderk222.hire.flow.candidate.usecase.RegisterCandidateUseCase;
import com.anderk222.hire.flow.candidate.usecase.dto.command.RegisterCandidateCommand;
import com.anderk222.hire.flow.candidate.usecase.dto.response.CandidateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidateService implements RegisterCandidateUseCase, GetCandidateUseCase {

    private final CandidateRepository candidateRepository;

    @Override
    public CandidateResponse register(RegisterCandidateCommand command) {
        // TODO: si candidateRepository.findByEmail(...) existe, devolverlo; si no, crear y guardar.
        throw new UnsupportedOperationException("TODO: implement register use case");
    }

    @Override
    public CandidateResponse getById(CandidateId id) {
        // TODO: candidateRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
