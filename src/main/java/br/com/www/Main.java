package br.com.www;


import br.com.www.models.BankSlip;
import br.com.www.models.CreditCard;
import br.com.www.models.Payment;
import br.com.www.models.Pix;

public class Main {
    public static void main(String[] args) {

        Payment creditCard = new CreditCard(250.0);
        creditCard.confirmPayment();

        Payment bankSlip = new BankSlip(500.00);
        bankSlip.confirmPayment();

        Payment pix = new Pix(300.00);
        pix.confirmPayment();

    }
}
