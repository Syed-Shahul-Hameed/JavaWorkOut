package datetimeUtils;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/* Day 5 Simulate a stopwatch using Instant and print elapsed time in seconds and milliseconds.*/
public class StopwatchSimulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press ENTER to start the stopwatch...");
        scanner.nextLine();
        Instant start = Instant.now();

        // Timer thread to display elapsed time
        Thread timerThread = timerThread(start);

        System.out.println("\nPress ENTER to stop the stopwatch...");
        scanner.nextLine();

        timerThread.interrupt();
        Instant end = Instant.now();

        Duration elapsed = Duration.between(start, end);
        long totalMillis = elapsed.toMillis();
        long totalSeconds = elapsed.getSeconds();

        System.out.println("\nFinal elapsed time: " + totalSeconds + " seconds");
        System.out.println("Final elapsed time: " + totalMillis + " milliseconds");

    }

    private static Thread timerThread(Instant start) {
        Thread timerThread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                Instant now = Instant.now();
                Duration elapsed = Duration.between(start, now);
                long seconds = elapsed.getSeconds();
                long millis = elapsed.toMillis() % 1000;
                System.out.print("\rElapsed: " + seconds + "s " + millis + "ms");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        timerThread.start();
        return timerThread;
    }
}
