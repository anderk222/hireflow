package com.anderk222.hire.flow.interview.usecase.dto.response;

import com.anderk222.hire.flow.interview.domain.model.InterviewMode;
import com.anderk222.hire.flow.interview.domain.model.InterviewType;

import java.time.Instant;
import java.util.List;

public record InterviewResponse(
        Long id,
        Long candidacyId,
        InterviewType type,
        InterviewMode mode,
        Instant scheduledAt,
        String locationOrLink,
        List<Long> participantIds
) {
}
