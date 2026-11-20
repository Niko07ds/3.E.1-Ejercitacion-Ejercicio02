package ejercicio02;

/**
 * Lógica de negocio: usa la conexión sin conocer el motor concreto.
 */
public class DatabaseAdministrator {

    private final DatabaseConnectionCreator creator;

    public DatabaseAdministrator(DatabaseConnectionCreator creator) {
        this.creator = creator;
    }

    public void testConnection() {
        DatabaseConnection connection = creator.openConnection();
        connection.executeTestQuery("SELECT 1");
        connection.disconnect();
    }
}
