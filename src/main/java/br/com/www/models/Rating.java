package br.com.www.models;

import java.util.List;

public class Rating<T> {

    private T item;
    private double grade;
    private String commentary;

    public Rating() {
    }

    public Rating(T item, double grade, String commentary) {
        if (grade > 10 || grade < 0) {
            throw new IllegalArgumentException("The grade must be between 0 and 10");
        }
        this.item = item;
        this.grade = grade;
        this.commentary = commentary;
    }

    public T getItem() {
        return item;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade > 10 || grade < 0) {
            throw new IllegalArgumentException("The grade must be between 0 and 10");
        }
        this.grade = grade;
    }

    public String getCommentary() {
        return commentary;
    }
    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public static <T> double calculateAverage(List<Rating<T>> ratings) {
        if(ratings.isEmpty()) {
            throw new IllegalArgumentException("The list of ratings is empty.");
        }
        double sumRatings = 0;
        for (Rating<T> rating : ratings) {
            sumRatings += rating.getGrade();
        }
        return sumRatings/ratings.size();
    }

    @Override
    public String toString() {
        return "Rating{" +
                "item=" + item +
                ", grade=" + grade +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
