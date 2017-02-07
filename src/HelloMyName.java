import java.util.Scanner;

/**
 * Created by Emiliano_Cantarutti on 2/6/2017.
 */
public class HelloMyName {

    public static void myName(){
        String name = null;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.print("Hello " + name);
    }
}
