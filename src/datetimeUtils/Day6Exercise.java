package datetimeUtils;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/* Day 6
Question: Write a program that takes any LocalDate, and prints the first and last day and date of that month.*/
public class Day6Exercise {
    public static void main(String[] args) throws InterruptedException {
        LocalDate localDate = LocalDate.now();
        System.out.println("Day of the year is : " + localDate.getDayOfYear());

        LocalDate startDayOfMonth = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Start date of the month is : " + startDayOfMonth);
        System.out.println("Day is : " + startDayOfMonth.getDayOfWeek());
        LocalDate endDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("End date of the month is : " + endDayOfMonth);
        System.out.println("Day is : " + endDayOfMonth.getDayOfWeek());
    }
}
