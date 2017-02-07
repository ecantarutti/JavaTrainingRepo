package converter;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to convert? ");
		System.out.println("a) Temperature");
		System.out.println("b) Length");
		String input = scan.nextLine();
		switch (input) {
		case "a":
			TemperatureConverter.selectingConversor();
			break;
		case "b":
			LengthConverter.selectingLengthConversor();
			break;
		default:
			System.out.println("Please select a valid option");
			break;
		}

	}

}
