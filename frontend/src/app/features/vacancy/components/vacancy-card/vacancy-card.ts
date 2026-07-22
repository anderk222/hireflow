import { Component, input } from '@angular/core';
import { VacancySummary } from '../../models/vacancy';

/** Presentational card for one row of the public vacancy listing (UC-01). */
@Component({
  selector: 'app-vacancy-card',
  imports: [],
  templateUrl: './vacancy-card.html',
  styleUrl: './vacancy-card.scss'
})
export class VacancyCard {
  readonly vacancy = input.required<VacancySummary>();
}
