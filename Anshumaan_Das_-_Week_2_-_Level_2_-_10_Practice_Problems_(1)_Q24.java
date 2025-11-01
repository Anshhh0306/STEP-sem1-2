import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class W2L2Q24 {
    public static void main(String[] args) {
        String text = "abc123";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println("Found: " + m.group());
        }
    }
}