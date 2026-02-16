package br.com.www.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double kilometersDriven;

    public Vehicle(String brand, String model, int year, double kilometersDriven) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.kilometersDriven = kilometersDriven;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getKilometersDriven() {
        return kilometersDriven;
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle("Honda", "Civic", 2015, 130000));
        vehicleList.add(new Vehicle("Hyundai", "Creta", 2020, 70000));
        vehicleList.add(new Vehicle("Toyota", "Corolla", 2024, 135000));
        vehicleList.add(new Vehicle("Chevrolet", "Tracker", 2022, 108000));

        String jsonVehicleList = gson.toJson(vehicleList);

        String fileName = "vehicleList.json";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(jsonVehicleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que instancia
um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */