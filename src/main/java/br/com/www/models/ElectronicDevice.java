package br.com.www.models;

import br.com.www.interfaces.Controllable;

import java.util.Objects;

public class ElectronicDevice implements Controllable {

    private boolean isOn;
    private String name;

    public ElectronicDevice() {
        this.isOn = false;
        this.name = null;
    }
    public ElectronicDevice(boolean isOn) {
        this.isOn = isOn;
        this.name = null;
    }
    public ElectronicDevice(String name) {
        this.isOn = false;
        this.name = name;
    }
    public ElectronicDevice(boolean isOn, String name) {
        this.isOn = isOn;
        this.name = name;
    }

    @Override
    public void turnOn() {
        String tempName = Objects.isNull(name)? "device" : name;

        if (this.isOn) {
            System.out.printf("The %s is already on.%n", tempName);
        } else {
            System.out.printf("Turning on %s...%n", tempName);
            this.isOn = true;
        }
    }

    @Override
    public void turnOff() {
        String tempName = Objects.isNull(name)? "device" : name;

        if (this.isOn) {
            System.out.printf("Turning off %s...%n", tempName);
            this.isOn = false;
        } else {
            System.out.printf("The %s is already off.%n", tempName);
        }
    }

}
