//Create DateManipulator class to convert String to date, date to String
//and to find out number of days between two dates.
package Assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class DateManipulator {

    // String → Date
    public static LocalDate stringToDate(String dateStr) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(dateStr, f);
    }

    // Date → String
    public static String dateToString(LocalDate date) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(f);
    }

    // Days between two dates
    public static long daysBetween(LocalDate d1, LocalDate d2) {
        return ChronoUnit.DAYS.between(d1, d2);
    }
}

// Main class
public class Q9_or_Q13_Date {

    public static void main(String[] args) {

        // Convert String to Date
        LocalDate d1 = DateManipulator.stringToDate("01-04-2023");
        LocalDate d2 = DateManipulator.stringToDate("10-04-2024");

        // Convert Date to String
        String result = DateManipulator.dateToString(d1);
        System.out.println("Formatted Date: " + result);

        // Find days difference
        long days = DateManipulator.daysBetween(d1, d2);
        System.out.println("Days between: " + days);
    }
}