import { Component, inject, signal } from '@angular/core';
import { VacancyCard } from '../../components/vacancy-card/vacancy-card';
import { VacancyService } from '../../services/vacancy';
import { VacancySummary } from '../../models/vacancy';

/** UC-01: public listing of open vacancies, with optional filters. */
@Component({
  selector: 'app-vacancy-list',
  imports: [VacancyCard],
  templateUrl: './vacancy-list.html',
  styleUrl: './vacancy-list.scss'
})
export class VacancyList {
  private readonly vacancyService = inject(VacancyService);

  readonly vacancies = signal<VacancySummary[]>([]);

  constructor() {
    // TODO: call vacancyService.listOpen(filter) and set the signal from the subscription.
  }
}
