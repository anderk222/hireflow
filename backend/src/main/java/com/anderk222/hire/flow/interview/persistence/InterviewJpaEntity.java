package com.anderk222.hire.flow.interview.persistence;

import com.anderk222.hire.flow.interview.domain.model.InterviewMode;
import com.anderk222.hire.flow.interview.domain.model.InterviewType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "interviews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InterviewJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long candidacyId;

    @Enumerated(EnumType.STRING)
    private InterviewType type;

    @Enumerated(EnumType.STRING)
    private InterviewMode mode;

    private Instant scheduledAt;
    private String locationOrLink;

    @ElementCollection
    private List<Long> participantIds;
}
