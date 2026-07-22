export type NotificationType = 'INTERVIEW_CONFIRMATION' | 'INTERVIEW_REMINDER';
export type NotificationStatus = 'SENT' | 'PENDING' | 'FAILED';

/** Mirrors NotificationResponse from the backend `notification` module. */
export interface Notification {
  id: number;
  recipientId: number;
  type: NotificationType;
  status: NotificationStatus;
}
