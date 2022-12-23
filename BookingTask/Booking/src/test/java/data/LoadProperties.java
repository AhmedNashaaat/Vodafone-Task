package data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static Properties userdata;

    static {
        try {
            userdata = LoadProperties(System.getProperty("user.dir")
                    +"\\src\\test\\java\\data\\CustomerAndPassengerData.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties LoadProperties(String path) throws IOException {
        Properties properties = new Properties();
        FileInputStream stream = new FileInputStream(path);
        properties.load(stream);
        return properties;

    }
}
