import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DateAPIWorkOuts {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate plusDays = today.plusDays(5);
        System.out.println("plusDays = " + plusDays);
        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("nextWeek = " + nextWeek);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted = today.format(formatter);
        System.out.println("formatted = " + formatted);
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("NY Time: " + nyTime);
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("IST Time: " + istTime);
        Instant now = Instant.now();
        System.out.println("Timestamp: " + now);
    }
}