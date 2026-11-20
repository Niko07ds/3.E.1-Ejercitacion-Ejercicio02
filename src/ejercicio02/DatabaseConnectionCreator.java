package ejercicio02;

/**
 * Creador abstracto: declara el método de fábrica que devuelve la conexión.
 */
public abstract class DatabaseConnectionCreator {

    // Método de fábrica: cada motor devuelve su conector configurado
    public abstract DatabaseConnection createConnection();

    // Operación común: crea la conexión y la deja abierta
    public DatabaseConnection openConnection() {
        DatabaseConnection connection = createConnection();
        System.out.println("Conexión creada para el motor: " + connection.getEngineName());
        connection.connect();
        return connection;
    }
}
