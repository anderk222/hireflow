package com.anderk222.hire.flow.hiring.usecase;

import com.anderk222.hire.flow.hiring.domain.model.JobOfferId;
import com.anderk222.hire.flow.hiring.usecase.dto.command.RespondToJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.response.JobOfferResponse;

/**
 * Caso de uso para la respuesta del candidato a una oferta. Al ACEPTAR
 * debe además mover la postulación enlazada a HIRED y pedirle a `vacancy`
 * que ocupe un cupo; al RECHAZAR la postulación vuelve a REJECTED y la
 * vacante sigue abierta (ver los README de los módulos para la
 * orquestación entre módulos que esto implica).
 */
public interface RespondToJobOfferUseCase {

    JobOfferResponse respond(JobOfferId jobOfferId, RespondToJobOfferCommand command);
}
