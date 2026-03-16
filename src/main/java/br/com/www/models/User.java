package br.com.www.models;

public class User {
    private String password;

    public User(String startPassword) {
        this.password = startPassword;
    }

    public void setPassword(String currentPassword, String newPassword) {
        if (currentPassword.equals(password)) {
            password = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Current password is incorrect. The password hasn't been changed.");
        }
    }

    public static void main(String[] args) {
        User user = new User("123456");

        user.setPassword("123456", "abcdef");
        user.setPassword("aBcdef", "xyz");
        user.setPassword("abcdef", "xyz");
    }
}
