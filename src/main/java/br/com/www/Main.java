package br.com.www;

import br.com.www.models.ElectronicDevice;

public class Main {
    public static void main(String[] args) {

        ElectronicDevice lamp = new ElectronicDevice("Lamp");
        ElectronicDevice airConditioning = new ElectronicDevice(true,"Air conditioning");

        lamp.turnOff();
        lamp.turnOn();
        lamp.turnOn();
        lamp.turnOff();

        System.out.println();
        System.out.println("----------------");
        System.out.println();

        airConditioning.turnOn();
        airConditioning.turnOff();
        airConditioning.turnOff();
        airConditioning.turnOn();

    }
}
