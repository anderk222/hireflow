import { HttpInterceptorFn } from '@angular/common/http';

/** TODO: attach the auth token (e.g. from AuthService) to outgoing requests. */
export const authInterceptor: HttpInterceptorFn = (req, next) => {
  return next(req);
};
