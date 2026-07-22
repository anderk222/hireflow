import { Injectable, signal } from '@angular/core';

/** TODO: replace with a real session (JWT, cookie, etc.) once auth is defined. */
@Injectable({ providedIn: 'root' })
export class AuthService {
  readonly isAuthenticated = signal(false);

  login(email: string, password: string): void {
    throw new Error('TODO: implement login');
  }

  logout(): void {
    throw new Error('TODO: implement logout');
  }
}
