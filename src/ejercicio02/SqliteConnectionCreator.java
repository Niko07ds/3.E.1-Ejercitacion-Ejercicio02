package ejercicio02;

/**
 * Creador concreto: construye conexiones a SQLite.
 */
public class SqliteConnectionCreator extends DatabaseConnectionCreator {

    private final String filePath;

    public SqliteConnectionCreator(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public DatabaseConnection createConnection() {
        return new SqliteConnection(filePath);
    }
}
