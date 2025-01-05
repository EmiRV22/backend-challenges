package com.geniedev.screenmatch.Main;

import com.geniedev.screenmatch.Title;
import com.geniedev.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título de la película: ");
        String movieTitle = scanner.nextLine().replace(" ", "+");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=" + movieTitle + "&apikey=8db5128c"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Imprimir la respuesta JSON
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

        scanner.close();
    }
}
