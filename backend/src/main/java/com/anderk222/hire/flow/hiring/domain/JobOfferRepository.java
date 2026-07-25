package com.anderk222.hire.flow.hiring.domain;

import com.anderk222.hire.flow.hiring.domain.model.JobOffer;
import com.anderk222.hire.flow.hiring.domain.model.JobOfferId;

import java.util.Optional;

public interface JobOfferRepository {

    JobOffer save(JobOffer jobOffer);

    Optional<JobOffer> findById(JobOfferId id);
}
