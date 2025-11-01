import javax.swing.*;

public class W2L2Q11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        JButton button = new JButton("Click");
        frame.add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}