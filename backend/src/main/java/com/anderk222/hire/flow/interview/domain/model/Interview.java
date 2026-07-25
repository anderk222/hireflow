package com.anderk222.hire.flow.interview.domain.model;

import com.anderk222.hire.flow.candidacy.domain.model.CandidacyId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

/**
 * Entidad de dominio para una entrevista agendada. `locationOrLink` es un
 * único campo a propósito: cuál es el significativo depende de {@link #mode}
 * (FA en CU-05: virtual lleva un link, presencial lleva una dirección/sala).
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Interview {

    private InterviewId id;
    private CandidacyId candidacyId;
    private InterviewType type;
    private InterviewMode mode;
    private Instant scheduledAt;
    private String locationOrLink;
    private List<Long> participantIds;

    /**
     * Regla de negocio: ningún participante puede tener un conflicto de agenda (FE en CU-05).
     * {@code conflictingInterviews} ya viene resuelto por el caso de uso (consultando
     * {@link com.anderk222.hire.flow.interview.domain.InterviewRepository}); el modelo
     * no conoce la BD, solo decide si esos datos violan la regla.
     */
    public void checkParticipantsAvailability(List<Interview> conflictingInterviews) {
        // TODO: si algún participantId se repite entre conflictingInterviews y este.participantIds,
        // throw new SchedulingConflictException(participantId).
        throw new UnsupportedOperationException("TODO: implement availability check");
    }
}
