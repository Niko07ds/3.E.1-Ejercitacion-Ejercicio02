package ejercicio02;

/**
 * Producto: interfaz genérica de conexión a un motor de base de datos.
 */
public interface DatabaseConnection {

    void connect();

    void executeTestQuery(String query);

    void disconnect();

    String getEngineName();
}
