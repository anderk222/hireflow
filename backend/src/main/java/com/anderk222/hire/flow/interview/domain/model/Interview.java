package com.anderk222.hire.flow.interview.domain.model;

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

    private Long id;
    private Long candidacyId;
    private InterviewType type;
    private InterviewMode mode;
    private Instant scheduledAt;
    private String locationOrLink;
    private List<Long> participantIds;

    /** Regla de negocio: ningún participante puede tener un conflicto de agenda (FE en CU-05). */
    public void checkParticipantsAvailability() {
        // TODO: delegar a un servicio/puerto de dominio que conozca la agenda de cada participante.
        throw new UnsupportedOperationException("TODO: implement availability check");
    }
}
