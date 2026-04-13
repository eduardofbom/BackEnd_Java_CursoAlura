package br.com.www.models;

public class ReservationVip extends Reservation{

    public ReservationVip() {
    }

    @Override
    public void reserve() {
        System.out.println("VIP reservation confirmed with exclusive service.");
    }

}
