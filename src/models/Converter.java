package models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converter {
    private String time_last_update_utc;
    private Gson gson;
    private ConvertingCurrencies convert;

    public Converter(CurrencyApiForm c){
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        this.time_last_update_utc = c.time_last_update_utc();
//        ConvertingCurrenciesApi convertingCurrencies = gson.fromJson(c.conversion_rates(), ConvertingCurrenciesApi.class);
//        ConvertingCurrencies converting = new ConvertingCurrencies(convertingCurrencies);
        this.convert = new ConvertingCurrencies(c.conversion_rates());
    }

    public double Converting(String convertingOption, double money){
        switch (convertingOption){
            case "1":
                money = convertingUSDtoARS(money);
                break;
            case "2":
                money = convertingARS(money);
                break;
            case "3":
                money = convertingUSDtoBRL(money);
                break;
            case "4":
                money = convertingBRLtoUSD(money);
                break;
            case "5":
                money = convertingUSDtoCOP(money);
                break;
            case "6":
                money = convertingCOPtoUSD(money);
                break;
            default:
                System.out.println("Error");
        }

        return money;
    }

    public double convertingUSDtoARS(double money) {
        return money * convert.getARS();
    }

    public double convertingARS(double money){
        return money * convert.getUSD();
    }

    public double convertingUSDtoBRL(double money){
        return money * convert.getBRL();
    }

    public double convertingBRLtoUSD(double money){
        return money * convert.getUSD();
    }

    public double convertingUSDtoCOP(double money){
        return money * convert.getCOP();
    }

    public double convertingCOPtoUSD(double money){
        return money * convert.getUSD();
    }
}
