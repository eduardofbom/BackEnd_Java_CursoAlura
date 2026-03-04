package br.com.www;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeliveryDateCalculator {
    public static void main(String[] args) {
        LocalDate dateStart = LocalDate.of(2026, 3, 15);
        int deadLineInDays = 15;
        LocalDate dateDelivey = dateStart.plusDays(deadLineInDays);

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyy");
        String dateDeliveyFormatted = dateDelivey.format(formatterDate);

        System.out.printf("Delivey date: %s", dateDeliveyFormatted);
    }
}


/*
Você é responsável pelos projetos em uma empresa de desenvolvimento de software.
Para garantir que os prazos sejam cumpridos, você precisa calcular a data de
entrega de cada projeto com base na data de início e no prazo estimado em dias.

Você precisa criar um programa que:
    1. Receba uma data de início.
    2. Adicione o prazo em dias ao início do projeto.
    3. Exiba a data final formatada corretamente.

Saída esperada:
Se a data de início for 15 de março de 2025 e o prazo for 15 dias, a saída deve ser:
    Data de entrega: 30-03-2025
 */