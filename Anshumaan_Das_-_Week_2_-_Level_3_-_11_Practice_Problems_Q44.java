import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class W2L3Q44 {
    public static void main(String[] args) {
        Properties props = new Properties();
        // Load properties
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            System.out.println("File not found, creating new.");
        }

        // Set properties
        props.setProperty("database.url", "jdbc:mysql://localhost:3306/mydb");
        props.setProperty("database.user", "root");

        // Save properties
        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            props.store(fos, "Database Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read properties
        System.out.println("URL: " + props.getProperty("database.url"));
        System.out.println("User: " + props.getProperty("database.user"));
    }
}