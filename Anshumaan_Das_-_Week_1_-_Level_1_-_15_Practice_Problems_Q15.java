public class Q15_15 {
    static class Animal {
        void sound() {
            System.out.println("Animal sound");
        }
    }
    static class Dog extends Animal {
        void sound() {
            System.out.println("Bark");
        }
    }
    static class Cat extends Animal {
        void sound() {
            System.out.println("Meow");
        }
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}