package Lab5.Challenge1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ExchangeDesk<USD, RON> exchangeDesk = new ExchangeDesk<>();
        ExchangeDesk<RON, USD> exchangeDesk1 = new ExchangeDesk<>();
        USD usd = new USD(10F, 4.00F);
        RON ron = new RON(40F, 0.25F);



        RON ron1 = exchangeDesk.convert(usd, RON.class);
        USD usd1 = exchangeDesk1.convert(ron, USD.class);
        System.out.println("From: " + usd.getValue() + " usd, to " + ron1 + " ron");
        System.out.println("From: " + ron.getValue() + " ron, to " + usd1 + " usd");
    }
}
