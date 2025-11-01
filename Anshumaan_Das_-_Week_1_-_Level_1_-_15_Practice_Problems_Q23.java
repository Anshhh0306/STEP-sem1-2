import java.io.*;

public class Q23_15 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            raf.writeUTF("Hello");
            raf.seek(0);
            System.out.println(raf.readUTF());
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}