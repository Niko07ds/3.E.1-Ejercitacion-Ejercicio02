package ejercicio02;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Creador de conexiones a bases de datos ");

        CreatorSelector selector = new CreatorSelector();

        // Configuraciones que simulan lo elegido por el usuario
        DatabaseConfig sqliteConfig = new DatabaseConfig("sqlite")
                .with("file", "datos/local.db");

        DatabaseConfig postgresConfig = new DatabaseConfig("postgresql")
                .with("host", "localhost")
                .with("port", "5432")
                .with("database", "ventas")
                .with("user", "admin");

        System.out.println("\n- Configuración 1: SQLite -");
        new DatabaseAdministrator(selector.select(sqliteConfig)).testConnection();

        System.out.println("\n- Configuración 2: PostgreSQL -");
        new DatabaseAdministrator(selector.select(postgresConfig)).testConnection();

        System.out.println("\n- Configuración 3: motor no soportado -");
        try {
            selector.select(new DatabaseConfig("oracle"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
