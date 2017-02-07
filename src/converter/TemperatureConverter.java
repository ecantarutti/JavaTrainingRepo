package converter;

import java.util.Scanner;

public class TemperatureConverter {
	static Scanner reader = new Scanner(System.in);
	static int option;
	static int temp;
	static double result;

	public static void selectingConversor() {
		System.out.println("What would you like to convert?");
		System.out.println("1) Farenheit to Celsius");
		System.out.println("2) Celsius to Farenheit");
		System.out.println("3) Celsius to Kelvin");
		System.out.println("4) Kelvin to Celsius");
		System.out.println("5) Farenheit to Kelvin");
		System.out.println("6) Kelvin to Farenheit");
		System.out.println("Select an option: ");
		option = reader.nextInt();

		switch (option) {
		case 1:
			readInput();
			farenheitToCelsius();
			printResult();
			System.out.print(" °C");
			break;

		case 2:
			readInput();
			celsiusToFarenheit();
			printResult();
			System.out.println(" °F");
			break;
		case 3:
			readInput();
			celsiusToKelvin();
			printResult();
			System.out.println(" K");
			break;
		case 4:
			readInput();
			kelvinToCelsius();
			printResult();
			System.out.println(" °C");
			break;
		case 5:
			readInput();
			farenheitToKelvin();
			printResult();
			System.out.println(" K");
			break;
		case 6:
			readInput();
			kelvinToFarenheit();
			printResult();
			System.out.println(" °F");
			break;
		default:
			System.out.println("Please select a valid option!");
			break;
		}

	}

	private static void farenheitToCelsius() {
		result = ((temp - 32) * 5) / 9;
	}

	private static void celsiusToFarenheit() {
		result = ((temp * 9) / 5) + 32;

	}

	private static void celsiusToKelvin() {
		result = temp + 273.15;
	}

	private static void kelvinToCelsius() {
		result = temp - 273.15;
	}

	private static void farenheitToKelvin() {
		farenheitToCelsius();
		temp = (int) result;
		celsiusToKelvin();
	}

	private static void kelvinToFarenheit() {
		kelvinToCelsius();
		temp = (int) result;
		celsiusToFarenheit();
	}

	private static void printResult() {
		System.out.print("The temperature is equal to " + result);
	}

	private static void readInput() {
		System.out.println("Please enter the temperature to be converted: ");
		temp = reader.nextInt();
	}

}
