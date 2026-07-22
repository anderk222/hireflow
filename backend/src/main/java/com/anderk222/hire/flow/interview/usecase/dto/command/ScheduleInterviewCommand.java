package com.anderk222.hire.flow.interview.usecase.dto.command;

import com.anderk222.hire.flow.interview.domain.model.InterviewMode;
import com.anderk222.hire.flow.interview.domain.model.InterviewType;

import java.time.Instant;
import java.util.List;

/** CU-05: datos capturados por el reclutador para agendar una entrevista. */
public record ScheduleInterviewCommand(
        Long candidacyId,
        InterviewType type,
        InterviewMode mode,
        Instant scheduledAt,
        String locationOrLink,
        List<Long> participantIds,
        boolean reminderEnabled
) {
}
