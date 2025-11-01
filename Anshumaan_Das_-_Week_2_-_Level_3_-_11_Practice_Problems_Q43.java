public class W2L3Q43 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java W2L3Q43 <name> <age>");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}