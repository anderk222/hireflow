import { Routes } from '@angular/router';

export const CANDIDACY_ROUTES: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/candidacy-review/candidacy-review').then(m => m.CandidacyReview)
  }
];
