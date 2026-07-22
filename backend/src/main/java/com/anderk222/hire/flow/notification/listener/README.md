# notification / listener

Lado consumidor (observador) del **patrón Observer**: escucha
`InterviewScheduledEvent`, publicado por el módulo `interview`, y dispara
los casos de uso de este módulo. `interview` no tiene idea de que esta
clase existe, que es justo el punto (Dependency Inversion Principle):
agregar o quitar observadores no requiere tocar el módulo productor.
