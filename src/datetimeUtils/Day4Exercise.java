package datetimeUtils;

import java.time.LocalDate;
import java.time.Period;

public class Day4Exercise {
    public static void main(String[] args) {
        /* Question: Given a birthdate (e.g., 2000-01-01), calculate exact age in years, months, and days.*/
        LocalDate birthDate = LocalDate.of(1990, 1, 19);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.printf("Age: %d years, %d months, %d days%n",
                          age.getYears(), age.getMonths(), age.getDays());
    }
}
