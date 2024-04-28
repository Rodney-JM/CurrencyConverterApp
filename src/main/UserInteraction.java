package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.Converter;
import models.ConvertingCurrenciesApi;
import models.CurrencyApiForm;

import java.io.IOException;
import java.util.Scanner;

public class UserInteraction {
    private Scanner scan;
    public UserInteraction(){
        scan = new Scanner(System.in);
    }
    public void userContacts() throws IOException, InterruptedException {
        System.out.println("*************");
        System.out.println("Seja bem-vindo(a) ao Conversor de moedas!");
        System.out.println("1)Dólar => Peso argentino\n2)Peso Argentino =>Dólar\n3)Dólar => Real Brasileiro\n4)Real brasileiro => Dólar" +
                "\n5)Dólar => Peso colombiano\n6)Peso colombiano =>Dólar\n7)Sair");
        System.out.println("*************");
        String option = "";

        while(true){
            JsonManipulate json = new JsonManipulate();
            System.out.println("Escolha uma opção válida:");
            option = scan.nextLine();
            if(option.equalsIgnoreCase("7")){
                break;
            }

            System.out.println("Digite a quantidade de dinheiro que deseja converter: ");
            double money = scan.nextDouble();
            scan.nextLine();

            String newMoney = json.currencyTransformation(option, money);

            System.out.println(newMoney);
            System.out.println("*************");
            System.out.println("1)Dólar => Peso argentino\n2)Peso Argentino =>Dólar\n3)Dólar => Real Brasileiro\n4)Real brasileiro => Dólar" +
                    "\n5)Dólar => Peso colombiano\n6)Peso colombiano =>Dólar\n7)Sair");
            System.out.println("*************");
        }
    }
}
