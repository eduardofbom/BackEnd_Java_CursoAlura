package br.com.www.models;

public class StudentWithType {
    private String name;
    private String type;

    public StudentWithType(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void identify() {
        System.out.printf("Student: %s - Type: %s%n", name, type);
    }
}
