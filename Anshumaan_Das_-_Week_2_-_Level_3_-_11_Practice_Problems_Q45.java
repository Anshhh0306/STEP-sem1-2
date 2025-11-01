import java.util.Calendar;
import java.util.GregorianCalendar;

public class W2L3Q45 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println("Current date: " + cal.get(Calendar.YEAR) + "-" +
                           (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));

        // Add days
        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After 10 days: " + cal.get(Calendar.YEAR) + "-" +
                           (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));

        // Check if leap year
        int year = cal.get(Calendar.YEAR);
        boolean isLeap = new GregorianCalendar().isLeapYear(year);
        System.out.println(year + " is leap year: " + isLeap);
    }
}