import { HttpInterceptorFn } from '@angular/common/http';

/** TODO: catch HTTP errors, map them to ApiError, and surface them (e.g. via a toast service). */
export const errorInterceptor: HttpInterceptorFn = (req, next) => {
  return next(req);
};
