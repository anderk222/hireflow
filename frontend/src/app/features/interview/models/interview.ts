export type InterviewType = 'HR' | 'TECHNICAL' | 'HIRING_MANAGER';
export type InterviewMode = 'ON_SITE' | 'VIRTUAL';

/** Mirrors InterviewResponse from the backend `interview` module. */
export interface Interview {
  id: number;
  candidacyId: number;
  type: InterviewType;
  mode: InterviewMode;
  scheduledAt: string;
  locationOrLink: string;
  participantIds: number[];
}

/** Mirrors ScheduleInterviewCommand (UC-05). */
export interface ScheduleInterviewRequest {
  candidacyId: number;
  type: InterviewType;
  mode: InterviewMode;
  scheduledAt: string;
  locationOrLink: string;
  participantIds: number[];
  reminderEnabled: boolean;
}
