package br.com.www.models;

public class TeacherWithDiscipline extends Person{

    private String discipline;

    public TeacherWithDiscipline(String name, Integer age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    @Override
    public void showSpecifications() {
        System.out.printf("%s: %s - Age: %d - Discipline: %s%n",
                this.getClass().getSimpleName(),
                name,
                age,
                discipline);
    }
}
