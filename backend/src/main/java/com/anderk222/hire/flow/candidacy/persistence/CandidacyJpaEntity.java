package com.anderk222.hire.flow.candidacy.persistence;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "candidacies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidacyJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vacancyId;
    private Long candidateId;

    @Enumerated(EnumType.STRING)
    private CandidacyStatus status;

    private String recruiterNotes;
    private Instant appliedAt;
}
