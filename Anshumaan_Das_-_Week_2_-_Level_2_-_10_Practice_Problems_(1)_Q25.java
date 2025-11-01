public class W2L2Q25 {
    enum Color {
        RED, GREEN, BLUE;
        public String getName() {
            return name().toLowerCase();
        }
    }
    public static void main(String[] args) {
        System.out.println(Color.RED.getName());
    }
}