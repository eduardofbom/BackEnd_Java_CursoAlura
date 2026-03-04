package br.com.www;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeNow {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateFormatted = date.format(formatterDate);

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        String timeFormatted = time.format(formatterTime);

        System.out.printf("""
                Formatted date: %s
                Formatted time: %s""", dateFormatted, timeFormatted);
    }
}

/*
Capturar a data e a hora atuais.
Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
Formatar a hora no padrão HH:mm (hora e minutos).
Exibir o resultado da formatação.

Saída esperada:
Data formatada: 15-03-2025
Hora formatada: 14:30
 */