package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class ConexionApiDinero {
    String url = "https://v6.exchangerate-api.com/v6/6a4d1b11c5f1ae5fc078c683/latest/";

    public DineroRecord dineroService(String divisa) {
        URI apiUri = URI.create(url + divisa);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(apiUri)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), DineroRecord.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error en la divisa:", e);
        }
    }
}
