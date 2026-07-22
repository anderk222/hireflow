package com.anderk222.hire.flow.interview.usecase;

import com.anderk222.hire.flow.interview.usecase.dto.response.InterviewResponse;

public interface GetInterviewUseCase {

    InterviewResponse getById(Long id);
}
