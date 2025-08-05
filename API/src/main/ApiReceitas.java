package main;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ApiReceitas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a receita: ");
        var buscaReceita = URLEncoder.encode(leitura.nextLine(), StandardCharsets.UTF_8);

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + buscaReceita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client

                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
