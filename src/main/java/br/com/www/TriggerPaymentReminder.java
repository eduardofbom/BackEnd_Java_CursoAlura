package br.com.www;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TriggerPaymentReminder {
    public static void main(String[] args) {
        LocalDate dueDate = LocalDate.of(2026, 3, 30);
        int daysInAdvance = 5;

        LocalDate paymentReminderDate = dueDate.minusDays(daysInAdvance);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String paymentReminderDateFormatted = paymentReminderDate.format(dateFormatter);

        System.out.println("Date of reminder: " + paymentReminderDateFormatted);
    }
}


/*
Você trabalha no setor financeiro de uma empresa e precisa garantir que as contas sejam pagas antes do vencimento. Para
isso, o sistema deve calcular a data exata em que um lembrete de pagamento deve ser disparado com base no prazo de
antecedência definido.

Por exemplo, se uma conta vence no dia 20 de um mês e os lembretes devem ser enviados 10 dias antes, a notificação deve
ser disparada no dia 10. Já se o vencimento for 30 de março de 2025 e a antecedência for de 5 dias, o lembrete deverá
ser enviado no dia 25 de março de 2025.

Crie um programa que, a partir de uma data de vencimento e um período de antecedência em dias, calcule e exiba a data
que o lembrete para pagamento deve ser disparado.

Saída esperada (Se a data de vencimento for 30 de março de 2025 e o período de antecedência for 5 dias):

Data do lembrete: 25-03-2025

*/