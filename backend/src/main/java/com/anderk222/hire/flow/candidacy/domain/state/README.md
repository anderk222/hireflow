# candidacy / domain / state

Implementación del **patrón State** para el ciclo de vida de una
postulación.

- `CandidacyState` — interfaz con un método por transición; cada uno
  lanza excepción por defecto (`invalidTransition`), así que un estado
  concreto solo necesita sobrescribir las transiciones que sí permite
  (Open/Closed Principle: agregar un estado nunca obliga a tocar los
  demás).
- Una clase por valor de `CandidacyStatus` (`ReceivedState`,
  `UnderReviewState`, etc.), cada una devolviendo el siguiente estado.
- `CandidacyStateFactory` — reconstruye el estado correcto a partir del
  `status` persistido; solo lo necesita el adaptador de persistencia.
