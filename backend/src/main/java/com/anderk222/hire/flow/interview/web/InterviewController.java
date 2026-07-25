package com.anderk222.hire.flow.interview.web;

import com.anderk222.hire.flow.interview.domain.model.InterviewId;
import com.anderk222.hire.flow.interview.usecase.GetInterviewUseCase;
import com.anderk222.hire.flow.interview.usecase.ScheduleInterviewUseCase;
import com.anderk222.hire.flow.interview.usecase.dto.command.ScheduleInterviewCommand;
import com.anderk222.hire.flow.interview.usecase.dto.response.InterviewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interviews")
@RequiredArgsConstructor
public class InterviewController {

    private final ScheduleInterviewUseCase scheduleInterviewUseCase;
    private final GetInterviewUseCase getInterviewUseCase;

    @PostMapping
    public InterviewResponse schedule(@RequestBody ScheduleInterviewCommand command) {
        return scheduleInterviewUseCase.schedule(command);
    }

    @GetMapping("/{id}")
    public InterviewResponse getById(@PathVariable Long id) {
        return getInterviewUseCase.getById(InterviewId.of(id));
    }
}
