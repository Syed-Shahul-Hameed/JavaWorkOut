import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day3Exercise {
    public static void main(String[] args) {
        /* Question: Write a Java program that takes a date string in the format "16-09-2025" and
            converts it into an ISO_LOCAL_DATE string(2025 - 09 - 16).
            Then, print the day of the week for this date.*/
        String input = "16-09-2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);

        // Convert to ISO format
        System.out.println("ISO format: " + date);

        // Print day of week
        System.out.println("Day of week: " + date.getDayOfWeek());
    }
}
