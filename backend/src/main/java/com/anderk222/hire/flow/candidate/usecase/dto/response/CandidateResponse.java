package com.anderk222.hire.flow.candidate.usecase.dto.response;

public record CandidateResponse(
        Long id,
        String fullName,
        String email,
        String phone,
        String resumeUrl
) {
}
