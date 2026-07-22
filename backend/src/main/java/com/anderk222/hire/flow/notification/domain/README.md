# notification / domain

Reglas de negocio del módulo **envío de notificaciones**, sin ninguna dependencia de
Spring, JPA ni HTTP. Aquí vive la entidad (o entidades) de dominio en
`model/` y el contrato del repositorio como una interfaz de este mismo
paquete: quien implemente esa interfaz (ver `persistence/`) puede
cambiarse sin tocar una sola línea de esta carpeta (Dependency Inversion).
