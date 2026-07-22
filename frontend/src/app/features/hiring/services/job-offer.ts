import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { GenerateJobOfferRequest, JobOffer, RespondToJobOfferRequest } from '../models/job-offer';

@Injectable({ providedIn: 'root' })
export class JobOfferService {
  private readonly http = inject(HttpClient);
  private readonly baseUrl = '/api/job-offers';

  generate(request: GenerateJobOfferRequest): Observable<JobOffer> {
    return this.http.post<JobOffer>(this.baseUrl, request);
  }

  getById(id: number): Observable<JobOffer> {
    return this.http.get<JobOffer>(`${this.baseUrl}/${id}`);
  }

  respond(id: number, request: RespondToJobOfferRequest): Observable<JobOffer> {
    return this.http.post<JobOffer>(`${this.baseUrl}/${id}/response`, request);
  }
}
