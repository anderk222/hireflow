# notification / email

Adaptador de salida concreto sobre correo electrónico. Cambiar de canal
(SMS, push) más adelante solo implica agregar otra clase que implemente
`NotificationSender` en una carpeta hermana — nada en `usecase/` o
`service/` cambia.
