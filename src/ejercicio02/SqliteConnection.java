package ejercicio02;

/**
 * Producto concreto: conexión simulada a SQLite (archivo local).
 */
public class SqliteConnection implements DatabaseConnection {

    private final String filePath;

    public SqliteConnection(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void connect() {
        System.out.println("[SQLite] Abriendo archivo de base de datos: " + filePath);
    }

    @Override
    public void executeTestQuery(String query) {
        System.out.println("[SQLite] Ejecutando consulta de prueba: " + query);
        System.out.println("[SQLite] Resultado: 1 fila (simulado)");
    }

    @Override
    public void disconnect() {
        System.out.println("[SQLite] Archivo cerrado.");
    }

    @Override
    public String getEngineName() {
        return "SQLite";
    }
}
