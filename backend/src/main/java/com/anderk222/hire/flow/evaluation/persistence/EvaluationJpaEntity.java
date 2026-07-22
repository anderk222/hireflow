package com.anderk222.hire.flow.evaluation.persistence;

import com.anderk222.hire.flow.evaluation.domain.model.EvaluationType;
import com.anderk222.hire.flow.evaluation.domain.model.Recommendation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "evaluations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EvaluationJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long interviewId;

    @Enumerated(EnumType.STRING)
    private EvaluationType type;

    @Column(length = 2000)
    private String observations;

    private double overallScore;

    @Enumerated(EnumType.STRING)
    private Recommendation recommendation;

    // NOTA: las puntuaciones por criterio se dejan fuera de este cascarón
    // a propósito; se mapearían a un @ElementCollection o una tabla hija.
}
