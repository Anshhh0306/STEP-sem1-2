import java.io.*;

public class Q16 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("File written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}