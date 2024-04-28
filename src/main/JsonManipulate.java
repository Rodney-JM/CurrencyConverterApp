package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Converter;
import models.ConvertingCurrencies;
import models.CurrencyApiForm;

import java.io.IOException;

public class JsonManipulate {
    private final Gson gson;
    private final CurrencyAPI api;
    private final ConvertingCurrencies convert;

    public JsonManipulate(){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        api = new CurrencyAPI();
        convert = new ConvertingCurrencies();
    }

    public String currencyTransformation(String currency, double money) throws IOException, InterruptedException {
        currency = convert.currencieConverted(currency);
        String response = api.getApiResponse(currency);

        CurrencyApiForm currencyApiForm = gson.fromJson(response, CurrencyApiForm.class);
        Converter convertingApiModels = new Converter(currencyApiForm);

        double newMoney = convertingApiModels.Converting(currency, money);
        return "O valor " + money + " em " + convert.convertCurrencieNumber(currency) + " resulta no valor de: " + newMoney + " em " + convert.convertConvertedName(currency);
    }
}
