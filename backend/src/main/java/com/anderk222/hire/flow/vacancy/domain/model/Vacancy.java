package com.anderk222.hire.flow.vacancy.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * Entidad de dominio. Lombok genera constructores y getters; las reglas de
 * negocio reales son los métodos de abajo.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vacancy {

    private Long id;
    private String title;
    private String description;
    private List<String> requirements;
    private int totalSlots;
    private int availableSlots;
    private String location;
    private WorkMode workMode;
    private LocalDate applicationDeadline;
    private VacancyStatus status;

    /** Regla de negocio: no se puede publicar sin cupos o con fecha límite vencida. */
    public void publish() {
        // TODO: validar totalSlots > 0 y que applicationDeadline sea futura.
        throw new UnsupportedOperationException("TODO: implement publish rule");
    }

    /** Regla de negocio: cerrar detiene la aceptación de nuevas postulaciones. */
    public void close() {
        // TODO: mover a CLOSED validando que la transición sea legal.
        throw new UnsupportedOperationException("TODO: implement vacancy closing");
    }

    /** CU-07: la contratación ocupa un cupo; se autocierra si llega a 0. */
    public void occupySlot() {
        // TODO: decrementar availableSlots y cerrar si llega a 0.
        throw new UnsupportedOperationException("TODO: implement slot occupation");
    }
}
