package main;

import models.ConvertingCurrencies;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyAPI {
    private ConvertingCurrencies convert;
    public CurrencyAPI(){
        convert = new ConvertingCurrencies();
    }
    public String getApiResponse(String currency) throws IOException, InterruptedException {
        String newCurrency = convert.convertCurrencieNumber(currency);
        String addres = "https://v6.exchangerate-api.com/v6/3df53059d6a91d727235bfd4/latest/" + newCurrency;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(addres))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
