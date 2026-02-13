package br.com.www;

import br.com.www.exceptions.InvalidPasswordException;

import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        if (password.length() < 8) {
            throw new InvalidPasswordException("password with less than 8 characters");
        } else {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ABOUT YOUR ACCOUNT ENTER:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        try {
            Login login = new Login(username, password);
            System.out.println("Invalid password. Access granted.");
        } catch(InvalidPasswordException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }

        scanner.close();
    }
}

/*
Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo,
ter pelo menos 8 caracteres).
 */