package br.com.www;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneSydney {
    public static void main(String[] args) {
        ZonedDateTime brazilDateTime = ZonedDateTime.now();
        ZonedDateTime sydneyDateTime = brazilDateTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.printf("""
                Current time in system: %s
                Current time in Sydney: %s""",
                brazilDateTime.format(timeformatter),
                sydneyDateTime.format(timeformatter));
    }
}

/*
Você trabalha em uma empresa global e precisa agendar reuniões com colegas da Austrália. Como os horários variam de
acordo com o fuso horário, você precisa de um sistema que converta automaticamente o horário local para o horário de
Sydney.

Crie um programa que converta o horário atual do sistema (fuso horário padrão) para o fuso horário de Sydney
(Australia/Sydney) e exiba apenas as horas e os minutos. Dica: Utilize o método withZoneSameInstant() para realizar a
conversão.

Saída esperada:

Horário atual no sistema: 12:00
Horário atual em Sydney: 22:00

 */