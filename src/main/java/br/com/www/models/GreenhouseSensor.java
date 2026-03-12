package br.com.www.models;

public class GreenhouseSensor {
    private String local;
    private double currentTemperature;

    public GreenhouseSensor(String local, double currentTemperature) {
        this.local = local;
        this.currentTemperature = currentTemperature;
    }

    public String getLocal() {
        return local;
    }
    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void showSpecifications() {
        System.out.printf("""
                Sensor location: %s
                Temperature: %.1f ºC%n""",
                local, currentTemperature);

        if (currentTemperature > 37.5) {
            System.out.println("Warning: The temperature is above the limit!");
        }
    }

    public static void main(String[] args) {
        GreenhouseSensor sensor = new GreenhouseSensor("Sector A", 39.2);
        sensor.showSpecifications();
    }
}
