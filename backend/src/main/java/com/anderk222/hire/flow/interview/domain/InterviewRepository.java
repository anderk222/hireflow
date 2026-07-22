package com.anderk222.hire.flow.interview.domain;

import com.anderk222.hire.flow.interview.domain.model.Interview;

import java.util.Optional;

public interface InterviewRepository {

    Interview save(Interview interview);

    Optional<Interview> findById(Long id);
}
