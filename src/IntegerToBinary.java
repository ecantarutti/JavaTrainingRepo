import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;

/**
 * Created by Emiliano_Cantarutti on 2/6/2017.
 */
public class IntegerToBinary {

    public static void readInt() {
        int a;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please input a number: ");
        a = scan.nextInt();
        String b = Integer.toBinaryString(a);

        System.out.println("The number " + a + " transformed into binary is: " + b);


    }


}
