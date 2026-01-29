package br.com.www.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a book to search: ");
        String input = scanner.nextLine();
        String searchBook = input.replace(" ", "%20");

        String address = "https://www.googleapis.com/books/v1/volumes/?q=" + searchBook;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println();
        System.out.println(response);
        System.out.println(response.body());

        scanner.close();
    }
}
