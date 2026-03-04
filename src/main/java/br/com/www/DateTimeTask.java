package br.com.www;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTask {
    public static void main(String[] args) {
        String task = "Send weekly report";

        LocalDate dateTask = LocalDate.now();
        LocalTime timeTask = LocalTime.now();

        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateTaskFormatted = dateTask.format(formatDate);

        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        String timeTaskFormatted = timeTask.format(formatTime);

        System.out.printf("""
                %nTASK: %s
                Registration date: %s
                Registration time: %s%n""", task, dateTaskFormatted, timeTaskFormatted);
    }
}
