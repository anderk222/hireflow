package com.anderk222.hire.flow.hiring.web;

import com.anderk222.hire.flow.hiring.domain.model.JobOfferId;
import com.anderk222.hire.flow.hiring.usecase.GenerateJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.GetJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.RespondToJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.dto.command.GenerateJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.command.RespondToJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.response.JobOfferResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job-offers")
@RequiredArgsConstructor
public class JobOfferController {

    private final GenerateJobOfferUseCase generateJobOfferUseCase;
    private final RespondToJobOfferUseCase respondToJobOfferUseCase;
    private final GetJobOfferUseCase getJobOfferUseCase;

    @PostMapping
    public JobOfferResponse generate(@RequestBody GenerateJobOfferCommand command) {
        return generateJobOfferUseCase.generate(command);
    }

    @GetMapping("/{id}")
    public JobOfferResponse getById(@PathVariable Long id) {
        return getJobOfferUseCase.getById(JobOfferId.of(id));
    }

    @PostMapping("/{id}/response")
    public JobOfferResponse respond(@PathVariable Long id, @RequestBody RespondToJobOfferCommand command) {
        return respondToJobOfferUseCase.respond(JobOfferId.of(id), command);
    }
}
