public class W2L3Q28 {
    private String outerMessage = "Outer class";

    class InnerClass {
        public void display() {
            System.out.println("Inner class accessing: " + outerMessage);
        }
    }

    static class StaticInnerClass {
        public void display() {
            System.out.println("Static inner class.");
        }
    }

    public static void main(String[] args) {
        W2L3Q28 outer = new W2L3Q28();
        InnerClass inner = outer.new InnerClass();
        inner.display();

        StaticInnerClass staticInner = new StaticInnerClass();
        staticInner.display();
    }
}