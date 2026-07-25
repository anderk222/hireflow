package com.anderk222.hire.flow.candidacy.web;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.candidacy.usecase.ApplyToVacancyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.GetCandidacyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.ReviewCandidacyUseCase;
import com.anderk222.hire.flow.candidacy.usecase.dto.command.ApplyToVacancyCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.command.ReviewDecisionCommand;
import com.anderk222.hire.flow.candidacy.usecase.dto.response.CandidacyResponse;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidacies")
@RequiredArgsConstructor
public class CandidacyController {

    private final ApplyToVacancyUseCase applyToVacancyUseCase;
    private final ReviewCandidacyUseCase reviewCandidacyUseCase;
    private final GetCandidacyUseCase getCandidacyUseCase;

    @PostMapping
    public CandidacyResponse apply(@RequestBody ApplyToVacancyCommand command) {
        return applyToVacancyUseCase.apply(command);
    }

    @GetMapping("/{id}")
    public CandidacyResponse getById(@PathVariable Long id) {
        return getCandidacyUseCase.getById(CandidacyId.of(id));
    }

    @GetMapping(params = "vacancyId")
    public List<CandidacyResponse> listByVacancy(@RequestParam Long vacancyId) {
        return reviewCandidacyUseCase.listByVacancy(VacancyId.of(vacancyId));
    }

    @PostMapping("/{id}/review")
    public CandidacyResponse review(@PathVariable Long id, @RequestBody ReviewDecisionCommand decision) {
        return reviewCandidacyUseCase.review(CandidacyId.of(id), decision);
    }
}
