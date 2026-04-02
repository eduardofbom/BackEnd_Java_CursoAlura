package br.com.www.models;

public class Person {
    protected String name;
    protected Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    public void showSpecifications() {
        System.out.printf("%s: %s - Age: %d%n",
                this.getClass().getSimpleName(),
                name,
                age);
    }
}
