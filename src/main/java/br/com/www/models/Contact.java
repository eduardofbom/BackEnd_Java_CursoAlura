package br.com.www.models;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("João Silva", "(11) 99999-0000"));
        contacts.add(new Contact("Luana Santos", "(21) 98888-0000"));
        contacts.add(new Contact("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("CONTACTS LIST:");
        int i = 1;
        for (Contact contact : contacts) {
            System.out.printf("%d. %s - %s%n",
                    i++,
                    contact.getName(),
                    contact.getPhoneNumber());
        }
    }
}
