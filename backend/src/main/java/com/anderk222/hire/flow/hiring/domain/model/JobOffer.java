package com.anderk222.hire.flow.hiring.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Entidad de dominio para CU-07: la oferta laboral enviada a un candidato
 * seleccionado y su resolución (aceptada, cambios solicitados, o rechazada).
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobOffer {

    private Long id;
    private Long candidacyId;
    private double salary;
    private String position;
    private String workMode;
    private LocalDate startDate;
    private OfferStatus status;

    /** FE en CU-07: el candidato rechaza la oferta -> la postulación queda REJECTED, la vacante sigue abierta. */
    public void reject() {
        // TODO: validar transición desde PENDING/CHANGES_REQUESTED, fijar status = REJECTED.
        throw new UnsupportedOperationException("TODO: implement reject rule");
    }

    /** Camino feliz: el candidato acepta -> dispara la contratación. */
    public void accept() {
        // TODO: validar transición, fijar status = ACCEPTED.
        throw new UnsupportedOperationException("TODO: implement accept rule");
    }
}
