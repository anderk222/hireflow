package com.anderk222.hire.flow.evaluation.usecase;

import com.anderk222.hire.flow.evaluation.usecase.dto.command.SubmitEvaluationCommand;
import com.anderk222.hire.flow.evaluation.usecase.dto.response.EvaluationResponse;

/** Caso de uso CU-06. Elige la {@code EvaluationStrategy} correspondiente según el tipo. */
public interface SubmitEvaluationUseCase {

    EvaluationResponse submit(SubmitEvaluationCommand command);
}
