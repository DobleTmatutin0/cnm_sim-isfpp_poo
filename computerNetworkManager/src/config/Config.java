// Esta clase tiene la responsabilidad de
// caargar y proporcionar acceso a la configuración de la aplicación.
// es la unica clase que accede al archivo config.properties

package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final String PATH = "config/config.properties";

    private static Config instance;
    private Properties appProperties;

    private Config() {
        appProperties = new Properties();
        try {
            appProperties.load(new FileInputStream(PATH));
        } catch (IOException e) {
            throw new RuntimeException(
                "No se pudo cargar config.properties",
                e
            );
        }
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getProperty(String key) {
        return appProperties.getProperty(key);
    }
}
