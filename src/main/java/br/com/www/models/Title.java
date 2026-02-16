package br.com.www.models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Title {
    private String name;
    private int yearOfReleased;
    private int durationInMinutes;

    public Title(String name, int yearOfReleased, int durationInMinutes) {
        this.name = name;
        this.yearOfReleased = yearOfReleased;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }
    public int getYearOfReleased() {
        return yearOfReleased;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Title title = new Title("Matrix", 1970, 94);
        String jsonTitle = gson.toJson(title);

        String fileName = "titles.json";
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(jsonTitle);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia
um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */