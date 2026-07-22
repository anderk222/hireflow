package com.anderk222.hire.flow.hiring.persistence;

import com.anderk222.hire.flow.hiring.domain.JobOfferRepository;
import com.anderk222.hire.flow.hiring.domain.model.JobOffer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class JobOfferRepositoryAdapter implements JobOfferRepository {

    private final JobOfferJpaRepository jpaRepository;

    @Override
    public JobOffer save(JobOffer jobOffer) {
        // TODO: mapear JobOffer -> JobOfferJpaEntity, guardar, mapear de vuelta a JobOffer.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<JobOffer> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain)
        throw new UnsupportedOperationException("TODO: implement findById");
    }
}
