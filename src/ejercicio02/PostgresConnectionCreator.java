package ejercicio02;

/**
 * Creador concreto: construye conexiones a PostgreSQL.
 */
public class PostgresConnectionCreator extends DatabaseConnectionCreator {

    private final String host;
    private final int port;
    private final String databaseName;
    private final String user;

    public PostgresConnectionCreator(String host, int port, String databaseName, String user) {
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.user = user;
    }

    @Override
    public DatabaseConnection createConnection() {
        return new PostgresConnection(host, port, databaseName, user);
    }
}
