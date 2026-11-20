package ejercicio02;

import java.util.HashMap;
import java.util.Map;

/**
 * Parámetros configurados por el usuario (motor elegido y sus datos).
 */
public class DatabaseConfig {

    private final String engine;
    private final Map<String, String> parameters = new HashMap<>();

    public DatabaseConfig(String engine) {
        this.engine = engine;
    }

    public DatabaseConfig with(String key, String value) {
        parameters.put(key, value);
        return this;
    }

    public String getEngine() {
        return engine;
    }

    public String get(String key) {
        return parameters.get(key);
    }
}
