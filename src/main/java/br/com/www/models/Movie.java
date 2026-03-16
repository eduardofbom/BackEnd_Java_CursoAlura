package br.com.www.models;

import java.util.ArrayList;

public class Movie {
    private String name;
    private ArrayList<Integer> ratings;

    public Movie(String name) {
        this.name = name;
        this.ratings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addRating(Integer rating) {
        if (rating > 5 || rating < 1) {
            System.out.println("Invalid rating. Please enter a value between 1 and 5.");
            return false;
        } else {
            ratings.add(rating);
            return true;
        }
    }

    public double calculateAverageRating() {
        int sumOfRatings = 0;
        for (Integer rating : ratings) {
            sumOfRatings += rating;
        }
        return (double) sumOfRatings / ratings.size();
    }

    public static void main(String[] args) {
        Movie matrix = new Movie("Matrix");
        matrix.addRating(5);
        matrix.addRating(4);
        matrix.addRating(5);
        matrix.addRating(3);
        matrix.addRating(4);

        System.out.printf("The average rating for %s is %.2f%n",
                matrix.getName(),
                matrix.calculateAverageRating());
    }
}
