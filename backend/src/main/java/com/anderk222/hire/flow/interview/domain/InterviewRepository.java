package com.anderk222.hire.flow.interview.domain;

import com.anderk222.hire.flow.interview.domain.model.Interview;
import com.anderk222.hire.flow.interview.domain.model.InterviewId;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface InterviewRepository {

    Interview save(Interview interview);

    Optional<Interview> findById(InterviewId id);

    /** Entrevistas ya agendadas en {@code scheduledAt} para cualquiera de {@code participantIds}. */
    List<Interview> findByParticipantIdsAndScheduledAt(List<Long> participantIds, Instant scheduledAt);
}
