import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { Evaluation, SubmitEvaluationRequest } from '../models/evaluation';

@Injectable({ providedIn: 'root' })
export class EvaluationService {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/evaluations';

  submit(request: SubmitEvaluationRequest): Observable<Evaluation> {
    return this.http.post<Evaluation>(this.baseUrl, request);
  }

  getById(id: number): Observable<Evaluation> {
    return this.http.get<Evaluation>(`${this.baseUrl}/${id}`);
  }
}
