package br.com.www.models;

import java.time.LocalDate;

public class Reservation {

    public Reservation() {
    }

    public void reserve() {
        System.out.println("Reservation made!");
    }

    public void reserve(LocalDate date) {
        System.out.println("Reservation made for " + date);
    }

    public void reserve(LocalDate date, Integer quantPeople) {
        System.out.println("Reservation made for " + date + " for " + quantPeople + " people");
    }

}
