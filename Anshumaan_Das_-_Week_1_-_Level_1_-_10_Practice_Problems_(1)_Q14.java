public class Q14 {
    static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        p.display();
    }
}