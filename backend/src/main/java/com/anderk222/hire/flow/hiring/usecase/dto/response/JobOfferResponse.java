package com.anderk222.hire.flow.hiring.usecase.dto.response;

import com.anderk222.hire.flow.hiring.domain.model.OfferStatus;

import java.time.LocalDate;

public record JobOfferResponse(
        Long id,
        Long candidacyId,
        double salary,
        String position,
        String workMode,
        LocalDate startDate,
        OfferStatus status
) {
}
