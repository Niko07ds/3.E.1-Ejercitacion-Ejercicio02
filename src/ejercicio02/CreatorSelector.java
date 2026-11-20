package ejercicio02;

/**
 * Decide qué creador instanciar según la configuración.
 * Esta lógica de selección está separada de la lógica de negocio.
 */
public class CreatorSelector {

    public DatabaseConnectionCreator select(DatabaseConfig config) {
        switch (config.getEngine().toLowerCase()) {
            case "sqlite":
                return new SqliteConnectionCreator(config.get("file"));
            case "postgresql":
                return new PostgresConnectionCreator(
                        config.get("host"),
                        Integer.parseInt(config.get("port")),
                        config.get("database"),
                        config.get("user"));
            default:
                throw new IllegalArgumentException(
                        "Motor de base de datos no soportado: " + config.getEngine());
        }
    }
}
