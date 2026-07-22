import { Routes } from '@angular/router';

/** Lazy-loaded from app.routes.ts under the /vacancies path. */
export const VACANCY_ROUTES: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/vacancy-list/vacancy-list').then(m => m.VacancyList)
  },
  {
    path: ':id',
    loadComponent: () => import('./pages/vacancy-detail/vacancy-detail').then(m => m.VacancyDetail)
  }
];
