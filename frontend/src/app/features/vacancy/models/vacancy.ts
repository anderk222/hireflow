export type WorkMode = 'ON_SITE' | 'REMOTE' | 'HYBRID';
export type VacancyStatus = 'DRAFT' | 'PUBLISHED' | 'CLOSED';

/** Mirrors VacancyResponse from the backend `vacancy` module. */
export interface Vacancy {
  id: number;
  title: string;
  description: string;
  requirements: string[];
  totalSlots: number;
  availableSlots: number;
  location: string;
  workMode: WorkMode;
  applicationDeadline: string;
  status: VacancyStatus;
}

/** Mirrors VacancySummaryResponse: the row shown in the public listing (UC-01). */
export interface VacancySummary {
  id: number;
  title: string;
  location: string;
  workMode: WorkMode;
}

/** Mirrors VacancyFilterCommand. */
export interface VacancyFilter {
  area?: string;
  workMode?: WorkMode;
  location?: string;
}

/** Mirrors PublishVacancyCommand (UC-03). */
export interface PublishVacancyRequest {
  title: string;
  description: string;
  requirements: string[];
  slots: number;
  location: string;
  workMode: WorkMode;
  applicationDeadline: string;
}
