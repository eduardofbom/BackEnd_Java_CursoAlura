package br.com.www.models;

public class GamifiedStudent {
    private String name;
    private Integer points;
    private Integer level;

    public GamifiedStudent(String name) {
        this.name = name;
        this.points = 0;
        this.level = 1;
    }

    public String getName() {
        return name;
    }
    public Integer getPoints() {
        return points;
    }
    public Integer getLevel() {
        return level;
    }

    public void updateLevel() {
        level = (points / 100) + 1;
    }

    public void earnPoints(Integer pointsEarned) {
        points += pointsEarned;
        this.updateLevel();
    }

    public void showStatus() {
        System.out.printf("""
                Name: %s
                Points: %s
                Level: %s""",
                name, points, level);
    }

    public static void main(String[] args) {
        GamifiedStudent student = new GamifiedStudent("Ana");
        student.earnPoints(120);
        student.earnPoints(120);
        student.showStatus();
    }
}
