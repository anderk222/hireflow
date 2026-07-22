import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { PublishVacancyRequest, Vacancy, VacancyFilter, VacancySummary } from '../models/vacancy';

@Injectable({ providedIn: 'root' })
export class VacancyService {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/vacancies';

  listOpen(filter: VacancyFilter = {}): Observable<VacancySummary[]> {
    return this.http.get<VacancySummary[]>(this.baseUrl, { params: { ...filter } });
  }

  getById(id: number): Observable<Vacancy> {
    return this.http.get<Vacancy>(`${this.baseUrl}/${id}`);
  }

  publish(request: PublishVacancyRequest): Observable<Vacancy> {
    return this.http.post<Vacancy>(this.baseUrl, request);
  }

  close(id: number): Observable<void> {
    return this.http.post<void>(`${this.baseUrl}/${id}/close`, {});
  }
}
