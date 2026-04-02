package br.com.www.models;

public class StudentWithGrade extends Person {

    private double grade;

    public StudentWithGrade(String name, Integer age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void showSpecifications() {
        System.out.printf("%s: %s - Age: %d - Grade: %.2f%n",
                this.getClass().getSimpleName(),
                name,
                age,
                grade);
    }
}
