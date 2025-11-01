public class Q43 {
    static abstract class Shape {
        abstract double area();
    }
    static class Circle extends Shape {
        double radius;
        Circle(double r) {
            radius = r;
        }
        double area() {
            return Math.PI * radius * radius;
        }
    }
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area: " + c.area());
    }
}