package br.com.www;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckWorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");


        System.out.print("Enter the entry time (HH:mm): ");
        String userEntryTime = scanner.nextLine();
        LocalTime entryTime = LocalTime.parse(userEntryTime, timeFormatter);

        System.out.print("Enter the daily workload (in hours): ");
        int dailyWorkloadInHours = scanner.nextInt();
        LocalTime estimatedDepartureTime = entryTime.plusHours(dailyWorkloadInHours);

        System.out.print("Enter the departure time (HH:mm): ");
        scanner.nextLine();
        String userDepartureTime = scanner.nextLine();
        LocalTime realDepartureTime = LocalTime.parse(userDepartureTime, timeFormatter);

        Duration extraWorkingHours = Duration.between(estimatedDepartureTime, realDepartureTime);

        System.out.println("\n-----------------------------------");
        System.out.println("Entry time: " + entryTime);
        System.out.println("Estimated departure time: " + estimatedDepartureTime);
        System.out.println("Real departure time: " + realDepartureTime);
        System.out.printf("Hours balance: %dh %dmin%n", extraWorkingHours.toHoursPart(), extraWorkingHours.toMinutesPart());
        System.out.println("-----------------------------------");
    }
}