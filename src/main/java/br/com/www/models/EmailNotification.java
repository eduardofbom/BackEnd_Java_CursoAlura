package br.com.www.models;

public class EmailNotification extends Notification{

    private String subject;

    public EmailNotification(String recipient, String message, String subject) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public void send() {
        System.out.printf("""
                Sending email to: %s
                Subject: %s
                Message: %s%n""",
                recipient,
                subject,
                message);
    }

}
