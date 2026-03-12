package br.com.www.models;

public class Student {
    private String name;
    private double grade1;
    private double grade2;

    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }
    public double getGrade1() {
        return grade1;
    }
    public double getGrade2() {
        return grade2;
    }

    public double calculateAverage() {
        return (grade1 + grade2) / 2.0;
    }

    public boolean isApproved() {
        if (calculateAverage() >= 7) {
            return true;
        }
        return false;
    }

    public void showResult() {
        System.out.printf("""
                Student: %s
                Grade 1: %.1f
                Grade 2: %.1f
                Average: %.1f
                Situation: %s%n""",
                name, grade1, grade2, calculateAverage(), (isApproved())?"PASSED":"FAILED");
    }

    public static void main(String[] args) {
        Student student = new Student("João Silva", 6.5, 7.5);
        student.showResult();
    }
}
