export type CandidacyStatus =
  | 'RECEIVED'
  | 'UNDER_REVIEW'
  | 'SHORTLISTED'
  | 'INTERVIEW_SCHEDULED'
  | 'EVALUATED'
  | 'SELECTED'
  | 'HIRED'
  | 'REJECTED';

/** Mirrors CandidacyResponse from the backend `candidacy` module. */
export interface Candidacy {
  id: number;
  vacancyId: number;
  candidateId: number;
  status: CandidacyStatus;
  recruiterNotes: string;
  appliedAt: string;
}

/** Mirrors ApplyToVacancyCommand (UC-02). */
export interface ApplyToVacancyRequest {
  vacancyId: number;
  candidateId: number;
}

/** Mirrors ReviewDecisionCommand (UC-04). */
export interface ReviewDecisionRequest {
  decision: 'SHORTLIST' | 'REJECT';
  notes: string;
}
