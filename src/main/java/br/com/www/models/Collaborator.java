package br.com.www.models;

import java.util.Scanner;

public class Collaborator {
    private String name;
    private String position;
    private Integer accessLevel;

    public Collaborator(String name, String position, Integer accessLevel) {
        this.name = name;
        this.position = position;
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return name + "(" +
                "position='" + position + '\'' +
                ", accessLevel=" + accessLevel +
                ')';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collaborator collaboratorEdward = new Collaborator("Edward", "Developer Junior", 1);

        System.out.println();
        System.out.println(collaboratorEdward);
        System.out.println();

        System.out.println("Current position: " + collaboratorEdward.getPosition());
        System.out.print("New position: ");
        collaboratorEdward.setPosition(scanner.nextLine());

        System.out.println("Current access level: " + collaboratorEdward.getAccessLevel());
        System.out.print("New access level: ");
        collaboratorEdward.setAccessLevel(scanner.nextInt());

        System.out.println();
        System.out.println(collaboratorEdward);
    }
}
