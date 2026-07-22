import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { ApplyToVacancyRequest, Candidacy, ReviewDecisionRequest } from '../models/candidacy';

@Injectable({ providedIn: 'root' })
export class CandidacyService {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/candidacies';

  apply(request: ApplyToVacancyRequest): Observable<Candidacy> {
    return this.http.post<Candidacy>(this.baseUrl, request);
  }

  getById(id: number): Observable<Candidacy> {
    return this.http.get<Candidacy>(`${this.baseUrl}/${id}`);
  }

  listByVacancy(vacancyId: number): Observable<Candidacy[]> {
    return this.http.get<Candidacy[]>(this.baseUrl, { params: { vacancyId } });
  }

  review(id: number, decision: ReviewDecisionRequest): Observable<Candidacy> {
    return this.http.post<Candidacy>(`${this.baseUrl}/${id}/review`, decision);
  }
}
