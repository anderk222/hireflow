import { CanActivateFn } from '@angular/router';

/**
 * TODO: check the current session (e.g. an AuthService signal) and redirect
 * to /auth/login when there isn't one. Left unimplemented on purpose: this
 * is only the architectural skeleton.
 */
export const authGuard: CanActivateFn = () => {
  throw new Error('TODO: implement authGuard');
};
