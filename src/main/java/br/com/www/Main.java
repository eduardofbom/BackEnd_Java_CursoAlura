package br.com.www;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> grades = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double sumGrades = grades.stream().reduce(0.0, Double::sum);
        double averageGrades = sumGrades / grades.size();

        double highestGrade = grades.stream().max(Double::compare).orElse(0.0);
        double lowestGrade = grades.stream().min(Double::compare).orElse(0.0);

        System.out.println("Average grades: " + averageGrades);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

    }
}
