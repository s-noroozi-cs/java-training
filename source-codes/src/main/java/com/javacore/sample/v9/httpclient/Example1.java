package com.javacore.sample.v9.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Example1 {
    public static void main(String[] args) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://www.google.com"))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.toString());
        System.out.println("""
                status code: %s
                body: %s
                headers: %s
                """
                .formatted(response.statusCode(),response.body(),
                        response.headers().map())
        );
    }
}
