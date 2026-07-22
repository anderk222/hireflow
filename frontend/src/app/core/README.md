# core

Servicios "singleton" y piezas transversales que se configuran **una sola
vez** para toda la aplicación: guards de rutas, interceptores HTTP y los
modelos de error de la API.

No contiene componentes ni nada relacionado a una pantalla concreta — eso
vive en `features/` o en `layout/`. Si una pieza de `core` empieza a
necesitar UI propia, probablemente pertenece a `shared/` o a un `feature`.
