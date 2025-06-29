package Day14;

import java.util.Scanner;

public class HandleExp2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int b=sc.nextInt();
        int a=0;

        try {
             a=10/b;
        }
        catch (ArithmeticException e) {
                a=10;
                System.out.println("please enter b greater than 0");
//            e.printStackTrace();
        }

        System.out.println(a);
        System.out.println("I am done ");
    }
}
