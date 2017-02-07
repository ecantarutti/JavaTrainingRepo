import java.util.Scanner;

/**
 * Created by Emiliano_Cantarutti on 2/6/2017.
 */
public class Calculator {

    public static void calculator() {

        Scanner scan = new Scanner(System.in);

        int a, b, result = 0;

        System.out.print("Please select an operation: ");
        String operation = scan.nextLine();

        System.out.print("Input a number: ");
        a = scan.nextInt();

        System.out.print("Input another number: ");
        b = scan.nextInt();

        switch(operation){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            //default: System.out.print("Please input a valid operand!");

        }
        System.out.println("The result is: " + result);
    }
}
