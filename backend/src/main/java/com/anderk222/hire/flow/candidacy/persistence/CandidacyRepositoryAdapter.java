package com.anderk222.hire.flow.candidacy.persistence;

import com.anderk222.hire.flow.candidacy.domain.CandidacyRepository;
import com.anderk222.hire.flow.candidacy.domain.model.Candidacy;
import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import com.anderk222.hire.flow.candidacy.domain.state.CandidacyStateFactory;
import com.anderk222.hire.flow.candidate.domain.model.CandidateId;
import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
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
    public Optional<Candidacy> findById(CandidacyId id) {
        // TODO: jpaRepository.findById(id.value()).map(this::toDomain), usando CandidacyStateFactory.of(entity.getStatus())
        throw new UnsupportedOperationException("TODO: implement findById");
    }

    @Override
    public List<Candidacy> findByVacancyId(VacancyId vacancyId) {
        // TODO: jpaRepository.findByVacancyId(vacancyId.value()).stream().map(this::toDomain).toList()
        throw new UnsupportedOperationException("TODO: implement findByVacancyId");
    }

    @Override
    public boolean existsByVacancyIdAndCandidateId(VacancyId vacancyId, CandidateId candidateId) {
        return jpaRepository.existsByVacancyIdAndCandidateId(vacancyId.value(), candidateId.value());
    }
}
