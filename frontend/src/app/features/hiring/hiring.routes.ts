import { Routes } from '@angular/router';

export const HIRING_ROUTES: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/job-offer/job-offer').then(m => m.JobOfferPage)
  }
];
