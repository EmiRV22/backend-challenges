package com.geniedev.screenmatch.Main;

import com.geniedev.screenmatch.Title;
import com.geniedev.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Title> titulos = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el título de la película (o escriba 'salir' para terminar): ");
            String movieTitle = scanner.nextLine();

            if (movieTitle.equalsIgnoreCase("salir")) {
                break;
            }

            String formattedTitle = movieTitle.replace(" ", "+");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.omdbapi.com/?t=" + formattedTitle + "&apikey=8db5128c"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            // Parsear la respuesta JSON a un objeto TitleOmdb usando Gson con configuración personalizada
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println(titleOmdb);

            Title title = new Title(titleOmdb);
            System.out.println(title);

            titulos.add(title);
        }

        // Mostrar los títulos almacenados
        System.out.println("\nPelículas almacenadas:");
        for (Title title : titulos) {
            title.showSpecs();
        }

        scanner.close();
    }
}
