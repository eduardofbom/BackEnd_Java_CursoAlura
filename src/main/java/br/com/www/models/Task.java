package br.com.www.models;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String description;
    private boolean completed;

    public Task(String discription, boolean completed) {
        this.description = discription;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void showTask() {
        System.out.printf("Task: %s - Status: %s%n",
                description, (isCompleted())?"Completed":"Pending");
    }

    @Override
    public String toString() {
        return "Task(" +
                "discription='" + description + '\'' +
                ", completed=" + completed +
                ')';
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Study Java", false));
        tasks.add(new Task("Do exercises", true));


        for (Task task : tasks) {
            task.showTask();
        }
    }
}
