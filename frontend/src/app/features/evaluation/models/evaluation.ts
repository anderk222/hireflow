export type EvaluationType = 'HR' | 'TECHNICAL' | 'HIRING_MANAGER';
export type Recommendation = 'HIRE' | 'MAYBE' | 'DO_NOT_HIRE';

export interface EvaluationCriterionScore {
  criterion: string;
  score: number;
}

/** Mirrors EvaluationResponse from the backend `evaluation` module. */
export interface Evaluation {
  id: number;
  interviewId: number;
  type: EvaluationType;
  scores: EvaluationCriterionScore[];
  observations: string;
  overallScore: number;
  recommendation: Recommendation;
}

/** Mirrors SubmitEvaluationCommand (UC-06). */
export interface SubmitEvaluationRequest {
  interviewId: number;
  type: EvaluationType;
  scores: EvaluationCriterionScore[];
  observations: string;
}
