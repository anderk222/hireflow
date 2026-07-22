import { Routes } from '@angular/router';

export const EVALUATION_ROUTES: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/evaluation-form/evaluation-form').then(m => m.EvaluationForm)
  }
];
