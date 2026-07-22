import { Component, inject, signal } from '@angular/core';
import { CandidacyService } from '../../services/candidacy';
import { Candidacy } from '../../models/candidacy';

/** CU-04: recruiter reviews the candidacies received for a vacancy. */
@Component({
  selector: 'app-candidacy-review',
  imports: [],
  templateUrl: './candidacy-review.html',
  styleUrl: './candidacy-review.scss'
})
export class CandidacyReview {
  private readonly candidacyService = inject(CandidacyService);

  readonly candidacies = signal<Candidacy[]>([]);

  constructor() {
    // TODO: read vacancyId (route param or query param) and call candidacyService.listByVacancy(...).
  }
}
