package converter;

import java.util.Scanner;

/**
 * Created by Emiliano_Cantarutti on 2/7/2017.
 */
public class CurrencyConverter {
    static double input, result;
    static Scanner scan = new Scanner(System.in);
    static int option;

    public static void selectingCurrencyConversor() {
        System.out.println("What would you like to convert?");
        System.out.println("1) EUR to Pln");
        System.out.println("2) Pln to Eur");
        System.out.println("3) Pln to USD");
        System.out.println("4) USD to Pln");
        System.out.println("5) USd to Eur");
        System.out.println("6) Eur to USD");
        System.out.println("Select an option: ");
        option = scan.nextInt();

        switch (option) {
            case 1:
                exchangeConverter();
                eurToPln();
                printResult();
                break;
            case 2:
                exchangeConverter();
                plnToEur();
                printResult();
                break;
            case 3:
                exchangeConverter();
                plnToUsd();
                printResult();
                break;
            case 4:
                exchangeConverter();
                usdToPln();
                printResult();
                break;
            case 5:
                exchangeConverter();
                usdToEur();
                printResult();
                break;
            case 6:
                exchangeConverter();
                eurToUsd();
                printResult();
                break;
            default:
                System.out.println("Please select a valid operand");
        }
    }

    private static void exchangeConverter() {
        System.out.println("Please enter the value to be converted: ");
        input = scan.nextFloat();
    }

    private static void eurToPln() {
        result = input * 4.30;
    }

    private static void plnToEur() {
        result = input * 0.23;
    }

    private static void plnToUsd() {
        result = input * 0.25;
    }

    private static void usdToPln() {
        result = input * 4.03;
    }

    private static void usdToEur() {
        result = input * .94;
    }

    private static void eurToUsd() {
        result = input * 1.07;
    }

    private static void printResult() {
        System.out.print("The exchange is equal to " + result);
    }

}


