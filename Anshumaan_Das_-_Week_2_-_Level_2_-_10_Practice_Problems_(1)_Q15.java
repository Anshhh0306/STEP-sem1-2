import java.util.Properties;

public class W2L2Q15 {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("key", "value");
        System.out.println(props.getProperty("key"));
    }
}