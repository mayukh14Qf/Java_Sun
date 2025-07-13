package Day15;

import java.math.BigInteger;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {

        /*
        write a code to find the factorial of a number
        5! = 5*4*3*2*1
         */

        /*

        BigInteger -----> Class, that can store memory or value, which does not have any limit.

         */


        BigInteger var1=new BigInteger("10"); // initialization
        BigInteger var2=new BigInteger("20");
        BigInteger add=var1.add(var2); // any function of BigInteger will return BigInteger
        // during creation ----> you pass the argument as String
        System.out.println(add);
        System.out.println(var1.subtract(var2));
        System.out.println(var1.multiply(var2));
        System.out.println(var1.divide(var2));
        System.out.println(var1.max(var2));
        System.out.println(var1.min(var2));
        System.out.println(var1.intValue()); // converting the data type to Integer
        System.out.println(var1.longValue());


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();

        BigInteger factor= new BigInteger("1"); //factor=1
        for (int i=1;i<=number;i++){
            factor=factor.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factor);

    }
}
