package datetimeUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Day3Exercise {
    public static void main(String[] args) {
        /* Question: Convert the current time in Asia/Kolkata to America/New_York.*/
        ZonedDateTime indTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime nyTime = indTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a z");
        // Convert to 12 hours format
        System.out.println("India Time (12hr): " + indTime.format(formatter).toUpperCase());
        System.out.println("New York Time (12hr): " + nyTime.format(formatter).toUpperCase());

    }
}
