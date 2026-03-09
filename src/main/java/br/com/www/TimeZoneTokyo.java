package br.com.www;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneTokyo {
    public static void main(String[] args) {
        ZonedDateTime tokyoDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String tokyoTimeFormatted = tokyoDateTime.format(formatter);

        System.out.printf("%nCurrent time in Tokyo: %s%n", tokyoTimeFormatted);
    }
}

/*
Você trabalha em uma empresa de viagens internacionais e precisa de um sistema que exiba o horário atual em diferentes
países. Como a empresa tem clientes no Japão, o sistema deve ser capaz de mostrar o horário atual na cidade de Tóquio,
independente do fuso horário do computador onde o programa está rodando.

Crie um programa que exiba o horário atual no fuso horário de Tóquio (Asia/Tokyo). Utilize a classe ZonedDateTime para
realizar a tarefa. Lembre-se de formatar a saída para exibir apenas horas, minutos e segundos.

Saída esperada:

Horário atual em Tóquio: 21:04:09

Obs: A hora e data atual dependerá do horário que você está realizando esta atividade.
 */
