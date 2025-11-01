import java.util.Optional;

public class Q37 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("Hello");
        System.out.println(opt.orElse("Default"));
    }
}