package br.com.www;

import java.time.Duration;
import java.time.LocalTime;

public class DifferenceBetweenTime {
    public static void main(String[] args) {
        LocalTime timeFirst = LocalTime.of(18,45);
        LocalTime timeSecond = LocalTime.of(16,45);

        Duration timeDuration = Duration.between(timeFirst, timeSecond);

        System.out.printf("Time difference: %d hours and %d minutes.", timeDuration.toHours(), timeDuration.toMinutesPart());

    }
}

/*
Você é responsável pelo controle de tempo em projetos dentro de uma agência de desenvolvimento. Você precisa
monitorar o tempo gasto em cada tarefa para garantir que os projetos sejam executados dentro do prazo.

Para isso, crie um programa que:
    1. Receba dois horários representando o início e o término de uma atividade.
    2. Calcule a diferença em horas e minutos entre esses dois horários.
    3. Exiba o resultado formatado.
    4. Saída esperada:

Se o primeiro horário for 14:30:00 e o segundo horário for 16:45:00, a saída deve ser:
    Diferença de tempo: 2 horas e 15 minutos
 */
