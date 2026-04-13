package br.com.www;

public class Notification {

    public Notification() {
    }

    public void sendMessage(String message) {
        System.out.println("Message sent to everyone: " + message);
    }

    public void sendMessage(String recipient, String message) {
        System.out.println("Message to " + recipient + ": " + message);
    }

    public void sendMessage(String recipient, String message, Integer numberOfRepetitions) {
        for (int i = 0; i < numberOfRepetitions; i++) {
            System.out.println("Message to " + recipient + ": " + message);
        }
    }

    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.sendMessage("Hello, World!");
        notification.sendMessage("Alice", "Hello, Alice!");
        notification.sendMessage("Bob", "Hello, Bob!", 3);
    }

}
