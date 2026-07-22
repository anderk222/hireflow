package com.anderk222.hire.flow.hiring.persistence;

import com.anderk222.hire.flow.hiring.domain.model.OfferStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "job_offers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobOfferJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long candidacyId;
    private double salary;
    private String position;
    private String workMode;
    private LocalDate startDate;

    @Enumerated(EnumType.STRING)
    private OfferStatus status;
}
