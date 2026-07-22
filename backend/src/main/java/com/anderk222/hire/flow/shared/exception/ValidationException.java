package com.anderk222.hire.flow.shared.exception;

/**
 * Se lanza cuando un comando/DTO de entrada falla una validación de la
 * capa de casos de uso (previa a las reglas de negocio del dominio).
 */
public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
