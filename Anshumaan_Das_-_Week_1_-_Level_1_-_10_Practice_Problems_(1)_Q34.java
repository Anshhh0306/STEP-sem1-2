import java.io.*;

public class Q34 {
    static class Person implements Serializable {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person p = new Person("John", 30);
        try {
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
            System.out.println("Serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}