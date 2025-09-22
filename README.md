# Java 17 Date/Time Workout Exercises

This repository contains a **5-day Java 17 Date & Time API workout plan**. Each day focuses on a practical exercise with a corresponding Java class as the solution.  

The exercises use the `java.time` package (`LocalDate`, `ZonedDateTime`, `Period`, `Duration`, etc.) introduced in Java 8 and enhanced in Java 17.  

---

## Day 1: Parsing and Formatting Dates
- **Question:** Convert `"16-09-2025"` into ISO format (`2025-09-16`) and print the day of the week.  
- **Solution Class:** `datetimeUtils/Day1Exercise.java`

---

## Day 2: Finding the Next Working Day
- **Question:** Write a method that takes a date and returns the next working day (Monday–Friday).  
- **Example:** `2025-09-19 (Friday)` → `2025-09-22 (Monday)`  
- **Solution Class:** `datetimeUtils/Day2Exercise.java`

---

## Day 3: Handling Time Zones
- **Question:** Convert the current time in `Asia/Kolkata` to `America/New_York`.  
- **Solution Class:** `datetimeUtils/Day3Exercise.java`

---

## Day 4: Calculating Age
- **Question:** Given a birthdate (e.g., `2000-01-01`), calculate exact age in years, months, and days.  
- **Solution Class:** `datetimeUtils/Day4Exercise.java`

---

## Day 5: Stopwatch Simulation with Duration
- **Question:** Simulate a stopwatch using `Instant` and print elapsed time in seconds and milliseconds.  
- **Solution Class:** `datetimeUtils/StopwatchSimulation.java`

---

## Day 6: First and last day and date of that month
- **Question:** Write a program that takes any LocalDate, and prints the first and last day and date of that month.  
- **Solution Class:** `datetimeUtils/Day6Exercise.java`

---

## How to Run
1. Compile the Java class of the day:  For example `javac Day1Exercise.java`
2. Run the program:  For example `java Day1Exercise`

