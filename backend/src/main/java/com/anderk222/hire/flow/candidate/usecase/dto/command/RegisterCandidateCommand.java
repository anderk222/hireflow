package com.anderk222.hire.flow.candidate.usecase.dto.command;

/** CU-02: datos del candidato capturados la primera vez que aplica. */
public record RegisterCandidateCommand(
        String fullName,
        String email,
        String phone,
        String resumeUrl
) {
}
