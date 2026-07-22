package com.anderk222.hire.flow.hiring.usecase;

import com.anderk222.hire.flow.hiring.usecase.dto.command.GenerateJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.response.JobOfferResponse;

public interface GenerateJobOfferUseCase {

    JobOfferResponse generate(GenerateJobOfferCommand command);
}
