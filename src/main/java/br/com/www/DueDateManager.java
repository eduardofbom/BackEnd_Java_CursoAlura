package br.com.www;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DueDateManager {
    public static void main(String[] args) {
        LocalDate dueDateOriginal = LocalDate.of(2026,3,20);
        int monthsOfPostponement = 3;
        LocalDate dueDatePostPonement = dueDateOriginal.plusMonths(monthsOfPostponement);

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dueDatePostponementFormatted = dueDatePostPonement.format(formatterDate);

        System.out.println("New due date: " + dueDatePostponementFormatted);
    }
}



/*
Você trabalha no setor financeiro de uma empresa de serviços e é responsável por gerenciar o vencimento
das faturas dos clientes. Em alguns casos, os clientes solicitam um adiamento da data de pagamento, e o
sistema precisa calcular a nova data de vencimento com base na quantidade de meses adicionados.

Crie um programa que:
    1. Receba uma data de vencimento original.
    2. Adicione um número de meses ao vencimento.
    3. A data ajustada deve ser exibida no formato dd-MM-yyyy.

Saída esperada - Se a data de vencimento original for 20 de março de 2025 e o adiamento for de 1 mês:
    Nova data de vencimento: 20-04-2025
 */
