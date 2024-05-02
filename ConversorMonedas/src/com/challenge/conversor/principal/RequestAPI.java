package com.challenge.conversor.principal;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class RequestAPI {
    public Divisa solicitud(String claveDivisaAConvertir, String claveDivisaObjetivo, String montoAConvertir) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d5c63fdf7ebadf442e5cc2cd/pair/"+ claveDivisaAConvertir+"/"+claveDivisaObjetivo+"/"+montoAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

        }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Divisa.class);
    }
}