import { Component, inject, signal } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { VacancyService } from '../../services/vacancy';
import { Vacancy } from '../../models/vacancy';

/** UC-01 detail: requirements, location and deadline for one vacancy. */
@Component({
  selector: 'app-vacancy-detail',
  imports: [],
  templateUrl: './vacancy-detail.html',
  styleUrl: './vacancy-detail.scss'
})
export class VacancyDetail {
  private readonly route = inject(ActivatedRoute);
  private readonly vacancyService = inject(VacancyService);

  readonly vacancy = signal<Vacancy | null>(null);

  constructor() {
    // TODO: read the :id route param and call vacancyService.getById(id).
  }
}
