import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { Interview, ScheduleInterviewRequest } from '../models/interview';

@Injectable({ providedIn: 'root' })
export class InterviewService {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/interviews';

  schedule(request: ScheduleInterviewRequest): Observable<Interview> {
    return this.http.post<Interview>(this.baseUrl, request);
  }

  getById(id: number): Observable<Interview> {
    return this.http.get<Interview>(`${this.baseUrl}/${id}`);
  }
}
