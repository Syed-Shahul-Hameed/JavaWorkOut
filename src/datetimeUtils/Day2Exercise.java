package datetimeUtils;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day2Exercise {
    public static void main(String[] args) {
        /* Question: Write a method that takes a date and returns the next working day (Monday–Friday).
        Example: 2025-09-19 (Friday) → 2025-09-22 (Monday)
        */
        System.out.println("Next working day is : " + getNextWorkingDay("19-09-2025"));
    }

    public static String getNextWorkingDay(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        LocalDate nextDate = date.plusDays(1);
        while (nextDate.getDayOfWeek() == DayOfWeek.SATURDAY ||
                nextDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            nextDate = nextDate.plusDays(1);
        }
        return nextDate.toString();
    }

}
