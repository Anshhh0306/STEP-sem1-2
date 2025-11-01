import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class W2L3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int startYear = scanner.nextInt();
        System.out.print("Enter end year: ");
        int endYear = scanner.nextInt();

        if (startYear > endYear || startYear < 1582) {
            System.out.println("Invalid range. Start year must be >= 1582 and <= end year.");
            return;
        }

        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                System.out.println(year);
            }
        }

        // Advanced: Validate a date string
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateStr = scanner.next();
        try {
            LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println("Valid date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }
}