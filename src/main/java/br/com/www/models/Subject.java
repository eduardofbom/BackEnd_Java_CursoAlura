package br.com.www.models;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private ArrayList<Double> grades;

    public Subject(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public Integer countValidGrades() {
        return grades.size();
    }

    public boolean validateGrade(double grade) {
        return grade>=0.0 && grade<=10.0;
    }

    public boolean addGrade(double grade) {
        if (validateGrade(grade)) {
            grades.add(grade);
            return true;
        } else {
            System.out.println("Invalid grade ignored: " + grade);
            return false;
        }
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }

    public static void main(String[] args) {
        Subject mathematics = new Subject("Mathematics");
        mathematics.addGrade(7.5);
        mathematics.addGrade(11.0);
        mathematics.addGrade(8.0);
        mathematics.addGrade(-3.0);
        mathematics.addGrade(9.5);

        System.out.println("\nTotal of valid grades: " + mathematics.countValidGrades());
        System.out.printf("Average in %s: %.2f%n", mathematics.getName(), mathematics.calculateAverage());
    }
}
