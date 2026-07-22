# evaluation / persistence

Adaptador de salida sobre Spring Data JPA para **registro de evaluaciones tras una entrevista**: la entidad
JPA (separada de la entidad de dominio a propósito), el repositorio Spring
Data y la clase que implementa el contrato de `domain/` usando ese
repositorio. Cambiar de motor de persistencia solo implica reemplazar esta
carpeta.
