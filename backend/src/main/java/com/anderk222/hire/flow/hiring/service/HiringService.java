package com.anderk222.hire.flow.hiring.service;

import com.anderk222.hire.flow.hiring.domain.JobOfferRepository;
import com.anderk222.hire.flow.hiring.usecase.GenerateJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.GetJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.RespondToJobOfferUseCase;
import com.anderk222.hire.flow.hiring.usecase.dto.command.GenerateJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.command.RespondToJobOfferCommand;
import com.anderk222.hire.flow.hiring.usecase.dto.response.JobOfferResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Orquesta CU-07. Una implementación completa también depende de los
 * casos de uso de `candidacy` (para mover la postulación a HIRED/REJECTED)
 * y de `vacancy` (para ocupar un cupo al aceptar) — se agregan como
 * dependencias de constructor una vez que esos casos de uso estén
 * implementados.
 */
@Service
@RequiredArgsConstructor
public class HiringService implements GenerateJobOfferUseCase, RespondToJobOfferUseCase, GetJobOfferUseCase {

    private final JobOfferRepository jobOfferRepository;

    @Override
    public JobOfferResponse generate(GenerateJobOfferCommand command) {
        // TODO: construir una JobOffer PENDING, guardarla, notificar al candidato.
        throw new UnsupportedOperationException("TODO: implement generate use case");
    }

    @Override
    public JobOfferResponse respond(Long jobOfferId, RespondToJobOfferCommand command) {
        // TODO: cargar la oferta, llamar accept()/reject() según command.response(),
        // guardar, y orquestar los efectos en candidacy/vacancy descritos arriba.
        throw new UnsupportedOperationException("TODO: implement respond use case");
    }

    @Override
    public JobOfferResponse getById(Long id) {
        // TODO: jobOfferRepository.findById(id) o lanzar ResourceNotFoundException, mapear a response.
        throw new UnsupportedOperationException("TODO: implement getById use case");
    }
}
