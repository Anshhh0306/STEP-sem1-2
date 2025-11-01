public class Q20 {
    interface Shape {
        double area();
    }
    static class Circle implements Shape {
        double radius;
        Circle(double r) {
            radius = r;
        }
        public double area() {
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area: " + c.area());
    }
}