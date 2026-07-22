package com.anderk222.hire.flow.vacancy.persistence;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VacancyJpaRepository extends JpaRepository<VacancyJpaEntity, Long> {

    List<VacancyJpaEntity> findByStatus(VacancyStatus status);
}
