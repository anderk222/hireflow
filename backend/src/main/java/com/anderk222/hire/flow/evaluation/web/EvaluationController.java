package com.anderk222.hire.flow.evaluation.web;

import com.anderk222.hire.flow.evaluation.usecase.GetEvaluationUseCase;
import com.anderk222.hire.flow.evaluation.usecase.SubmitEvaluationUseCase;
import com.anderk222.hire.flow.evaluation.usecase.dto.command.SubmitEvaluationCommand;
import com.anderk222.hire.flow.evaluation.usecase.dto.response.EvaluationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluations")
@RequiredArgsConstructor
public class EvaluationController {

    private final SubmitEvaluationUseCase submitEvaluationUseCase;
    private final GetEvaluationUseCase getEvaluationUseCase;

    @PostMapping
    public EvaluationResponse submit(@RequestBody SubmitEvaluationCommand command) {
        return submitEvaluationUseCase.submit(command);
    }

    @GetMapping("/{id}")
    public EvaluationResponse getById(@PathVariable Long id) {
        return getEvaluationUseCase.getById(id);
    }
}
