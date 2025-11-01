import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class GenericList<T> {
    private List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}

public class W2L3Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericList<String> stringList = new GenericList<>();
        System.out.println("Enter strings (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) break;
            stringList.add(input);
        }
        System.out.println("List contents:");
        stringList.printAll();

        GenericList<Integer> intList = new GenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("Integer list:");
        intList.printAll();
    }
}