package models;

public class ConvertingCurrencies {
    private double BRL;
    private double AED;
    private double AFN;
    private double USD;
    private double ALL;
    private double AMD;
    private double ANG;
    private double ARS;
    private double BOB;
    private double CLP;
    private double COP;

    public ConvertingCurrencies(ConvertingCurrenciesApi c){
        this.BRL = c.BRL();
        this.AED = c.AED();
        this.AFN = c.AFN();
        this.ALL = c.ALL();
        this.AMD = c.AMD();
        this.ANG = c.ANG();
        this.USD = c.USD();
        this.ARS = c.ARS();
        this.BOB = c.BOB();
        this.CLP = c.CLP();
        this.COP = c.COP();
    }

    public ConvertingCurrencies(){

    }

    public String convertCurrencieNumber(String currency){
        switch (currency){
            case "1", "3":
                currency = "USD";
                break;
            case "2" :
                currency = "ARS";
                break;
            case "4":
                currency = "BRL";
                break;
            case "5":
                currency = "USD";
                break;
            case "6":
                currency = "COP";
                break;
        }
        return currency;
    }
    public String convertConvertedName(String currency){
        switch (currency){
            case "1":
                currency = "ARS";
                break;
            case "2", "6", "4":
                currency = "USD";
                break;
            case "3":
                currency = "BRL";
                break;
            case "5":
                currency = "COP";
                break;
        }
        return currency;
    }

    public String currencieConverted(String currency){
        switch (currency){
            case "BRL":
                currency = "real";
                break;
            case "AED":
                currency = "Dirham dos Emirados Árabes Unidos";
                break;
            case "AFN":
                currency = "Afegane";
                break;
            case "ALL":
                currency = "Lek Albanesa";
                break;
            case "AMD":
                currency = "Dram Armênio";
                break;
            case "ANG":
                currency = "Florim das Antilhas Neerlandesas";
                break;
            case "USD":
                currency = "Dólar Americano";
                break;
            case "ARS":
                currency = "Peso argentino";
                break;
            case "BOB":
                currency = "Boliviano boliviano";
                break;
            case "CLP":
                currency = "Peso chileno";
                break;
            case "COP":
                currency = "Peso colombiano";
        }
        return currency;
    }

    public double getBRL() {
        return BRL;
    }

    public double getAED() {
        return AED;
    }

    public double getAFN() {
        return AFN;
    }

    public double getUSD() {
        return USD;
    }

    public double getALL() {
        return ALL;
    }

    public double getAMD() {
        return AMD;
    }

    public double getANG() {
        return ANG;
    }

    public double getARS() {
        return ARS;
    }

    public double getBOB() {
        return BOB;
    }

    public double getCLP() {
        return CLP;
    }

    public double getCOP() {
        return COP;
    }
}
