package br.com.www.models;

public class Car {
    private String model;
    private String plate;
    private Integer year;

    public Car(String model, String plate, Integer year) {
        this.model = model;
        this.plate = plate;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public String getPlate() {
        return plate;
    }
    public Integer getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car gol = new Car("Gol", "ABC-1D23", 2010);

        System.out.printf("""
                %nREGISTERED VEHICLE:
                Model: %s
                Plate: %s
                Year: %d%n""",
                gol.getModel(), gol.getPlate(), gol.getYear());
    }
}
