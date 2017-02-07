package converter;

import java.util.Scanner;

/**
 * Created by Emiliano_Cantarutti on 2/7/2017.
 */
public class LengthConverter {
    static Scanner reader = new Scanner(System.in);
    static int option;
    static float distance;
    static double result;

    public static void selectingLengthConversor() {
        System.out.println("What would you like to convert?");
        System.out.println("1) Millimeters to Centimeters");
        System.out.println("2) Millimeters to Meters");
        System.out.println("3) Centimeters to Millimeters");
        System.out.println("4) Centimeters to Meters");
        System.out.println("5) Meters to cm");
        System.out.println("6) Meters to mm");
        System.out.println("Select an option: ");
        option = reader.nextInt();

        switch (option) {
            case 1:
                readInput();
                mmToCm();
                printResult();
                System.out.print(" cm");
                break;
            case 2:
                readInput();
                mmToM();
                printResult();
                System.out.print(" m");
                break;
            case 3:
                readInput();
                cmToMm();
                printResult();
                System.out.print(" mm");
                break;
            case 4:
                readInput();
                mToCm();
                printResult();
                System.out.print(" cm");
                break;
            case 5:
                readInput();
                mmToCm();
                printResult();
                System.out.print(" cm");
                break;
            case 6:
                readInput();
                mToMm();
                printResult();
                System.out.print(" mm");
                break;
            case 7:
                System.out.println("Please select a valid option");
                break;
        }
    }

    private static void readInput() {
        System.out.println("Please enter the temperature to be converted: ");
        distance = reader.nextFloat();
    }

    private static void mmToCm() {
        result = distance / 100;
    }

    private static void mmToM() {
        result = distance / 1000;
    }

    private static void mToMm() {
        result = distance * 1000;
    }

    private static void mToCm() {
        result = distance * 100;
    }

    private static void cmToMm() {
        result = distance * 10;
    }

    private static void cmToM() {
        result = distance / 10;
    }

    private static void printResult() {
        System.out.print("The length is equal to " + result);
    }

}
