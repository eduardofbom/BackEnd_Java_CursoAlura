package br.com.www;

import br.com.www.models.EmailNotification;
import br.com.www.models.Notification;
import br.com.www.models.PushNotification;
import br.com.www.models.SmsNotification;

public class Main {
    public static void main(String[] args) {

        Notification email = new EmailNotification(
                "client@example.com",
                "Take advantage of our weekly discounts.",
                "Special Offer!");

        Notification sms = new SmsNotification(
                "+55 (79) 98765-4321",
                "Your invoice has been successfully paid."
        );

        Notification push = new PushNotification(
                "user_app",
                "You have a new message that hasn't been read.",
                "News!"
        );

        email.send();
        sms.send();
        push.send();

    }
}
