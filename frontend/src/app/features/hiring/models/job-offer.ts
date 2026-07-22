export type OfferStatus = 'PENDING' | 'CHANGES_REQUESTED' | 'ACCEPTED' | 'REJECTED';
export type OfferResponse = 'ACCEPT' | 'REQUEST_CHANGES' | 'REJECT';

/** Mirrors JobOfferResponse from the backend `hiring` module. */
export interface JobOffer {
  id: number;
  candidacyId: number;
  salary: number;
  position: string;
  workMode: string;
  startDate: string;
  status: OfferStatus;
}

/** Mirrors GenerateJobOfferCommand (UC-07). */
export interface GenerateJobOfferRequest {
  candidacyId: number;
  salary: number;
  position: string;
  workMode: string;
  startDate: string;
}

/** Mirrors RespondToJobOfferCommand. */
export interface RespondToJobOfferRequest {
  response: OfferResponse;
}
