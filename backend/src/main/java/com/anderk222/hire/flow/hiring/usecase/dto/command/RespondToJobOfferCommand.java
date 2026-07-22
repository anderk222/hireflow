package com.anderk222.hire.flow.hiring.usecase.dto.command;

/** CU-07: la respuesta del candidato a una oferta laboral. */
public record RespondToJobOfferCommand(
        Response response
) {
    public enum Response {
        ACCEPT,
        REQUEST_CHANGES,
        REJECT
    }
}
