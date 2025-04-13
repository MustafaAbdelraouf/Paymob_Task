package Common_Use;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private Properties properties;

    public Config(File file) {
        loadProperties(file);
    }

    private void loadProperties(File file) {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // For getting individual value.
    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    // For getting values as array.
    public String[] Insert_Data(String key) {
        String value = properties.getProperty(key);
        if (value != null) {
            return value.split(","); // Split by comma and return as array
        }
        return new String[0];

    }
}


