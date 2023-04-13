package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {
        var url = "https://api.nationalize.io/?name=nathaniel";

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client = HttpClient.newBuilder().build();

        var res = client.send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(res.statusCode());
        System.out.println(res.body());
    }
}