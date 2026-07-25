package com.anderk222.hire.flow.hiring.usecase;

import com.anderk222.hire.flow.hiring.domain.model.JobOfferId;
import com.anderk222.hire.flow.hiring.usecase.dto.response.JobOfferResponse;

public interface GetJobOfferUseCase {

    JobOfferResponse getById(JobOfferId id);
}
