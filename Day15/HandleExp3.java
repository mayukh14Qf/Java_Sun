package Day15;

import java.util.Scanner;

public class HandleExp3{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int b=sc.nextInt();
        int a=0;

        try {
            a=10/b; // B-->0
        }
        catch (ArithmeticException e) {
            a=10;
            System.out.println("please enter b greater than 0");

           // e.printStackTrace();  // it will give the details of the error
           // System.out.println(e); // it will also give the same
        }
        System.out.println(a);

    }
}
