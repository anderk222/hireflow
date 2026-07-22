import { Routes } from '@angular/router';

export const INTERVIEW_ROUTES: Routes = [
  {
    path: '',
    loadComponent: () => import('./pages/interview-schedule/interview-schedule').then(m => m.InterviewSchedule)
  }
];
