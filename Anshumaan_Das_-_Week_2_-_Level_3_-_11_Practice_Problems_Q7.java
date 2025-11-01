import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class W2L3Q7 {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        // Advanced: Extract domain
        if (matcher.matches()) {
            String[] parts = email.split("@");
            if (parts.length == 2) {
                System.out.println("Domain: " + parts[1]);
            }
        }
    }
}