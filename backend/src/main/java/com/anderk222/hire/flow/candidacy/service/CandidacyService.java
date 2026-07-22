package com.anderk222.hire.flow.candidacy.service;

import com.anderk222.hire.flow.candidacy.domain.CandidacyRepository;
import com.anderk222.hire.flow.candidacy.usecase.ApplyToVacancyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.GetCandidacyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.ReviewCandidacyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.dto.command.ApplyToVacancyCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.command.ReviewDecisionCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidacyService implements ApplyToVacancyUseCase, ReviewCandidacyUseCase, GetCandidacyUseCase {

    private final CandidacyRepository candidacyRepository;

    @Override
    public CandidacyResponse apply(ApplyToVacancyCommand command) {
        // TODO: rechazar si candidacyRepository.existsByVacancyIdAndCandidateId(...) es true,
        // si no, crear una Candidacy en ReceivedState, guardar y mapear a response.
        throw new UnsupportedOperationException("TODO: implement apply use case");
    }

    @Override
    public List<CandidacyResponse> listByVacancy(Long vacancyId) {
        // TODO: candidacyRepository.findByVacancyId(vacancyId), mapear a lista de response.
        throw new UnsupportedOperationException("TODO: implement listByVacancy use case");
    }

    @Override
    public CandidacyResponse review(Long candidacyId, ReviewDecisionCommand decision) {
        // TODO: cargar postulación, llamar shortlist(notes)/reject(notes) según decision.decision(), guardar.
        throw new UnsupportedOperationException("TODO: implement review use case");
    }

    @Override
    public CandidacyResponse getById(Long id) {
        // TODO: candidacyRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
