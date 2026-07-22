package com.anderk222.hire.flow.vacancy.persistence;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyStatus;
import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/** Representación JPA de una vacante. Separada de la entidad de dominio a propósito. */
@Entity
@Table(name = "vacancies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacancyJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ElementCollection
    private List<String> requirements;

    private int totalSlots;
    private int availableSlots;
    private String location;

    @Enumerated(EnumType.STRING)
    private WorkMode workMode;

    private LocalDate applicationDeadline;

    @Enumerated(EnumType.STRING)
    private VacancyStatus status;
}
