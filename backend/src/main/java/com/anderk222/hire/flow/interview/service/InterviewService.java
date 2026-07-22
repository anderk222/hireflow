package com.anderk222.hire.flow.interview.service;

import com.anderk222.hire.flow.interview.domain.InterviewRepository;
import com.anderk222.hire.flow.interview.usecase.GetInterviewUseCase;
import com.anderk222.hire.flow.interview.usecase.ScheduleInterviewUseCase;
import com.anderk222.hire.flow.interview.usecase.dto.command.ScheduleInterviewCommand;
import com.anderk222.hire.flow.interview.usecase.dto.response.InterviewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterviewService implements ScheduleInterviewUseCase, GetInterviewUseCase {

    private final InterviewRepository interviewRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public InterviewResponse schedule(ScheduleInterviewCommand command) {
        // TODO: construir Interview, llamar checkParticipantsAvailability(), guardarla,
        // mover la postulación relacionada a INTERVIEW_SCHEDULED, luego:
        // eventPublisher.publishEvent(new InterviewScheduledEvent(...));
        throw new UnsupportedOperationException("TODO: implement schedule use case");
    }

    @Override
    public InterviewResponse getById(Long id) {
        // TODO: interviewRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
