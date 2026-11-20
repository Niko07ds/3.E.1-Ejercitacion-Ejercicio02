package ejercicio02;

/**
 * Producto concreto: conexión simulada a PostgreSQL (servidor remoto).
 */
public class PostgresConnection implements DatabaseConnection {

    private final String host;
    private final int port;
    private final String databaseName;
    private final String user;

    public PostgresConnection(String host, int port, String databaseName, String user) {
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.user = user;
    }

    @Override
    public void connect() {
        System.out.println("[PostgreSQL] Conectando a " + host + ":" + port
                + "/" + databaseName + " con el usuario " + user);
    }

    @Override
    public void executeTestQuery(String query) {
        System.out.println("[PostgreSQL] Ejecutando consulta de prueba: " + query);
        System.out.println("[PostgreSQL] Resultado: 1 fila (simulado)");
    }

    @Override
    public void disconnect() {
        System.out.println("[PostgreSQL] Conexión cerrada.");
    }

    @Override
    public String getEngineName() {
        return "PostgreSQL";
    }
}
