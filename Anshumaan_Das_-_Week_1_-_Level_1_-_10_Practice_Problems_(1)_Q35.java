import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Q35 {
    public static void main(String[] args) {
        String text = "Hello 123 World";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}