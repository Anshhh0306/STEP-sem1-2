import java.net.*;

public class W2L2Q16 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println("Response: " + conn.getResponseCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}