package br.com.www.models;

public class PushNotification extends Notification{

    private String title;

    public PushNotification(String recipient, String message, String title) {
        super(recipient, message);
        this.title = title;
    }

    @Override
    public void send() {
        System.out.printf("""
                Sending push notification to: %s
                Title: %s
                Content: %s%n""",
                recipient,
                title,
                message);
    }
}
