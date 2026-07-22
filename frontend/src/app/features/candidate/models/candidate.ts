/** Mirrors CandidateResponse from the backend `candidate` module. */
export interface Candidate {
  id: number;
  fullName: string;
  email: string;
  phone: string;
  resumeUrl: string;
}

/** Mirrors RegisterCandidateCommand (captured the first time someone applies). */
export interface RegisterCandidateRequest {
  fullName: string;
  email: string;
  phone: string;
  resumeUrl: string;
}
