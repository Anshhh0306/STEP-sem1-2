import java.io.PrintWriter;

public class W2L2Q26 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(System.out);
            pw.println("Hello");
            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}