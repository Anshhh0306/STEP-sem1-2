public class Q30 {
    static class Box<T> {
        T value;
        Box(T value) {
            this.value = value;
        }
        T get() {
            return value;
        }
    }
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(10);
        System.out.println(box.get());
    }
}