package com.anderk222.hire.flow.shared.domain.exception;

/**
 * Excepción genérica para cuando una entidad de dominio no existe
 * (vacante, candidato, postulación, entrevista, etc.).
 */
public class ResourceNotFoundException extends DomainException {

    public ResourceNotFoundException(String resource, Object identifier) {
        super("%s not found with id %s".formatted(resource, identifier));
    }
}
