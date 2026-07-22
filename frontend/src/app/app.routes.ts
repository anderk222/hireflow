import { Routes } from '@angular/router';
import { Shell } from './layout/shell/shell';

/**
 * Each business module owns its own routes file and is lazy-loaded here.
 * `auth` is deliberately outside the `Shell` (no header/sidebar on the
 * login screen); everything else renders inside it.
 */
export const routes: Routes = [
  {
    path: 'auth',
    loadChildren: () => import('./features/auth/auth.routes').then(m => m.AUTH_ROUTES)
  },
  {
    path: '',
    component: Shell,
    children: [
      { path: '', redirectTo: 'vacancies', pathMatch: 'full' },
      {
        path: 'vacancies',
        loadChildren: () => import('./features/vacancy/vacancy.routes').then(m => m.VACANCY_ROUTES)
      },
      {
        path: 'candidacies',
        loadChildren: () => import('./features/candidacy/candidacy.routes').then(m => m.CANDIDACY_ROUTES)
      },
      {
        path: 'interviews',
        loadChildren: () => import('./features/interview/interview.routes').then(m => m.INTERVIEW_ROUTES)
      },
      {
        path: 'evaluations',
        loadChildren: () => import('./features/evaluation/evaluation.routes').then(m => m.EVALUATION_ROUTES)
      },
      {
        path: 'hiring',
        loadChildren: () => import('./features/hiring/hiring.routes').then(m => m.HIRING_ROUTES)
      }
    ]
  }
];
