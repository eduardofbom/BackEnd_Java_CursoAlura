package br.com.www.models;

public class SmsNotification extends Notification{

    public SmsNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.printf("""
                Sending SMS to: %s
                Message: %s%n""",
                recipient,
                message);
    }
}
