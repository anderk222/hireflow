package com.anderk222.hire.flow.evaluation.service;

import com.anderk222.hire.flow.evaluation.domain.EvaluationRepository;
import com.anderk222.hire.flow.evaluation.domain.model.EvaluationId;
import com.anderk222.hire.flow.evaluation.domain.strategy.EvaluationStrategy;
import com.anderk222.hire.flow.evaluation.usecase.GetEvaluationUseCase;
import com.anderk222.hire.flow.evaluation.usecase.SubmitEvaluationUseCase;
import com.anderk222.hire.flow.evaluation.usecase.dto.command.SubmitEvaluationCommand;
import com.anderk222.hire.flow.evaluation.usecase.dto.response.EvaluationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EvaluationService implements SubmitEvaluationUseCase, GetEvaluationUseCase {

    private final EvaluationRepository evaluationRepository;
    private final List<EvaluationStrategy> strategies;

    @Override
    public EvaluationResponse submit(SubmitEvaluationCommand command) {
        // TODO: strategies.stream().filter(s -> s.supports(command.type())).findFirst()
        //   .orElseThrow(...), llamar evaluate(...), construir Evaluation, guardar, mapear a response.
        throw new UnsupportedOperationException("TODO: implement submit use case");
    }

    @Override
    public EvaluationResponse getById(EvaluationId id) {
        // TODO: evaluationRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
