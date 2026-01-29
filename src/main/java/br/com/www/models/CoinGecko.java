package br.com.www.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a cripto coin to search: ");
        String input = scanner.nextLine();
        String searchCripto = input.replace(" ", "%20");
        String current = "usd";

        String address = "https://api.coingecko.com/api/v3/simple/price?ids=" + searchCripto + "&vs_currencies=" + current;

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
