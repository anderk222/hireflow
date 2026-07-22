package com.anderk222.hire.flow.candidate.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Entidad de dominio: datos de perfil de un candidato (info personal,
 * contacto, hoja de vida). No sabe nada del proceso de selección en sí
 * mismo — eso vive en el módulo `candidacy`.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Candidate {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private String resumeUrl;
}
