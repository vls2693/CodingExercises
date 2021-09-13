package academy.exercise9;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
        }
        else {
            long days = (minutes / 60) / 24;
            long years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}