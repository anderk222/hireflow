package com.anderk222.hire.flow.vacancy.web;

import com.anderk222.hire.flow.vacancy.domain.model.VacancyId;
import com.anderk222.hire.flow.vacancy.domain.model.WorkMode;
import com.anderk222.hire.flow.vacancy.usecase.BrowseVacanciesUseCase;
import com.anderk222.hire.flow.vacancy.usecase.CloseVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.PublishVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.UpdateVacancyUseCase;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.PublishVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.UpdateVacancyCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.command.VacancyFilterCommand;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancyResponse;
import com.anderk222.hire.flow.vacancy.usecase.dto.response.VacancySummaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Adaptador de entrada HTTP del módulo vacancy (CU-01, CU-03).
 * Solo traduce HTTP <-> casos de uso; sin lógica de negocio aquí.
 */
@RestController
@RequestMapping("/api/vacancies")
@RequiredArgsConstructor
public class VacancyController {

    private final PublishVacancyUseCase publishVacancyUseCase;
    private final UpdateVacancyUseCase updateVacancyUseCase;
    private final CloseVacancyUseCase closeVacancyUseCase;
    private final BrowseVacanciesUseCase browseVacanciesUseCase;

    @GetMapping
    public List<VacancySummaryResponse> listOpen(@RequestParam(required = false) String area,
                                                  @RequestParam(required = false) WorkMode workMode,
                                                  @RequestParam(required = false) String location) {
        return browseVacanciesUseCase.listOpen(new VacancyFilterCommand(area, workMode, location));
    }

    @GetMapping("/{id}")
    public VacancyResponse getById(@PathVariable Long id) {
        return browseVacanciesUseCase.getById(VacancyId.of(id));
    }

    @PostMapping
    public ResponseEntity<VacancyResponse> publish(@RequestBody PublishVacancyCommand command) {
        return ResponseEntity.ok(publishVacancyUseCase.publish(command));
    }

    @PutMapping("/{id}")
    public VacancyResponse update(@PathVariable Long id, @RequestBody UpdateVacancyCommand command) {
        return updateVacancyUseCase.update(VacancyId.of(id), command);
    }

    @PostMapping("/{id}/close")
    public ResponseEntity<Void> close(@PathVariable Long id) {
        closeVacancyUseCase.close(VacancyId.of(id));
        return ResponseEntity.noContent().build();
    }
}
