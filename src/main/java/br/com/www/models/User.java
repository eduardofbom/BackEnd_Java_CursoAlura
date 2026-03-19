package br.com.www.models;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User(String startPassword) {
        this.password = startPassword;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
    public boolean setPassword(String currentPassword, String newPassword) {
        if (currentPassword.equals(password)) {
            password = newPassword;
            System.out.println("Password changed successfully!");
            return true;
        } else {
            System.out.println("Current password is incorrect. The password hasn't been changed.");
            return false;
        }
    }

    public boolean validateUser(String inputLogin, String inputPassword) {
        return inputPassword.equals(this.password) && inputLogin.equals(this.login);
    }

    public static void main(String[] args) {
//        User user = new User("123456");
//        user.setPassword("123456", "abcdef");
//        user.setPassword("aBcdef", "xyz");
//        user.setPassword("abcdef", "xyz");

//        System.out.println("Incorrect password! Remaining attempts: " + );
//        System.out.println("Login successful.");

        User user2 = new User("aluno2025", "escola@123");
        Scanner scanner = new Scanner(System.in);
        for (int i = 2; i >= 0; i--) {
            System.out.print("Login: ");
            String userLogin = scanner.nextLine();
            System.out.print("Password: ");
            String userPassword = scanner.nextLine();

            if (user2.validateUser(userLogin, userPassword)) {
                System.out.println("Login successful.");
                break;
            } else {
                if (i == 0) {
                    System.out.println("Access blocked. Contact the administrator.");
                } else {
                    System.out.println("Incorrect password. Remaining attempts: " + i);
                }
            }
        }
        scanner.close();
    }
}
