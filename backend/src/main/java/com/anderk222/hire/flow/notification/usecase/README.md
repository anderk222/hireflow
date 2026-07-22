# notification / usecase

Contratos de los casos de uso de **envío de notificaciones**: una interfaz por operación
(Interface Segregation Principle), implementada por `service/`. Cualquier
otro módulo o adaptador que necesite invocar un caso de uso depende de
estas interfaces, nunca de la implementación concreta (Dependency
Inversion) — así se puede sustituir `service/` sin modificar a quien lo usa.
