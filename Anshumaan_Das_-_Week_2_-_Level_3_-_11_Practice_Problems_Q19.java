enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class W2L3Q19 {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        // Iterate through all days
        System.out.println("All days:");
        for (Day day : Day.values()) {
            System.out.println(day + " - Ordinal: " + day.ordinal());
        }

        // Check if weekend
        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's a weekday.");
        }

        // Switch on enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of work week.");
                break;
            case FRIDAY:
                System.out.println("TGIF!");
                break;
            case SUNDAY:
                System.out.println("Rest day.");
                break;
            default:
                System.out.println("Regular day.");
        }
    }
}