package com.anderk222.hire.flow.candidate.web;

import com.anderk222.hire.flow.candidate.domain.model.CandidateId;
import com.anderk222.hire.flow.candidate.usecase.GetCandidateUseCase;
import com.anderk222.hire.flow.candidate.usecase.dto.response.CandidateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor
public class CandidateController {

    private final GetCandidateUseCase getCandidateUseCase;

    @GetMapping("/{id}")
    public CandidateResponse getById(@PathVariable Long id) {
        return getCandidateUseCase.getById(CandidateId.of(id));
    }
}
