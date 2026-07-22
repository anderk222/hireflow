package com.anderk222.hire.flow.shared.web;

import java.time.Instant;

/**
 * Forma estándar de error devuelta por la API para cualquier excepción
 * capturada por {@link GlobalExceptionHandler}.
 */
public record ApiError(
        Instant timestamp,
        int status,
        String error,
        String message,
        String path
) {
}
