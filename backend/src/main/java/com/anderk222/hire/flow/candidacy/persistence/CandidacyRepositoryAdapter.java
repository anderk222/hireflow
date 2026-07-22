package com.anderk222.hire.flow.candidacy.persistence;

import com.anderk222.hire.flow.candidacy.domain.CandidacyRepository;
import com.anderk222.hire.flow.candidacy.domain.model.Candidacy;
import com.anderk222.hire.flow.candidacy.domain.state.CandidacyStateFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Reconstruye el {@link com.anderk222.hire.flow.candidacy.domain.state.CandidacyState}
 * actual de la entidad de dominio a partir de la columna {@code status}
 * persistida, usando {@link CandidacyStateFactory}.
 */
@Component
@RequiredArgsConstructor
public class CandidacyRepositoryAdapter implements CandidacyRepository {

    private final CandidacyJpaRepository jpaRepository;

    @Override
    public Candidacy save(Candidacy candidacy) {
        // TODO: mapear Candidacy -> CandidacyJpaEntity (status = candidacy.getStatus()), guardar, mapear de vuelta.
        throw new UnsupportedOperationException("TODO: implement save");
    }

    @Override
    public Optional<Candidacy> findById(Long id) {
        // TODO: jpaRepository.findById(id).map(this::toDomain), usando CandidacyStateFactory.of(entity.getStatus())
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    @Override
    public List<Candidacy> findByVacancyId(Long vacancyId) {
        // TODO: jpaRepository.findByVacancyId(vacancyId).stream().map(this::toDomain).toList()
        throw new UnsupportedOperationException("TODO: implement findByVacancyId");
    }

    @Override
    public boolean existsByVacancyIdAndCandidateId(Long vacancyId, Long candidateId) {
        return jpaRepository.existsByVacancyIdAndCandidateId(vacancyId, candidateId);
    }
}
