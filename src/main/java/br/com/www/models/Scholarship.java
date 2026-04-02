package br.com.www.models;

public class Scholarship extends StudentWithType{
    public Scholarship(String name) {
        super(name, "Scholarship");
    }

    public static void main(String[] args) {
        StudentWithType student1 = new StudentWithType("Ana", "Regular");
        Scholarship student2 = new Scholarship("Lucas");

        student1.identify();
        student2.identify();
    }
}
