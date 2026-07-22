/** Mirrors com.anderk222.hire.flow.shared.infrastructure.web.ApiError on the backend. */
export interface ApiError {
  timestamp: string;
  status: number;
  error: string;
  message: string;
  path: string;
}
