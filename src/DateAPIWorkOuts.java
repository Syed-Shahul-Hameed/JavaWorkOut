import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DateAPIWorkOuts {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        LocalDate today = LocalDate.now();
        System.out.println("today = "+today);
        LocalDate plusDays = today.plusDays(5);
        System.out.println("plusDays = "+plusDays);
    }
}