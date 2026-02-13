package br.com.www;

import br.com.www.exceptions.QueryNotFoundException;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class GithubQuery {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the GitHub's username: ");
        String username = scanner.nextLine();
        String usernameEncode = URLEncoder.encode(username);

        String uriAdress = "https://api.github.com/users/" + username;
        System.out.println(uriAdress);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uriAdress))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new QueryNotFoundException("User not found on GitHub");
            }

            String json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (QueryNotFoundException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }

        scanner.close();
    }
}


/*
Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub (utilize a API
pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que
estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch, trate de forma
específica essa exceção, exibindo uma mensagem amigável.
 */

