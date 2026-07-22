# interview / domain / model

Entidad(es) y enums de dominio de **agendamiento de entrevistas**. Las clases mutables usan
Lombok (`@Getter`, `@Setter`, `@NoArgsConstructor`, `@AllArgsConstructor`,
`@Builder`) para evitar boilerplate; los métodos de negocio (marcados con
`TODO`) son los únicos que se escriben a mano, porque ahí es donde vive la
regla real.
