package br.com.www.models;

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

    public void changePosition(String position) {

    }
}
