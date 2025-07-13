package Day15;
import java.util.Scanner;
/*

How to create custom exception :

1. create the class with any class name you want
2.extend Exception class
3.use super keyword to call the Exception class/parent class constructor
4.that constructor should take a parameter ---> String

*/


class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(String s){
        super(s);
    }
}


public class CustomException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int b=sc.nextInt();
        int a=0;

        // If my b is anything less than zero , then show a custom exception

        try {
            if(b<0){
                throw new AgeLessThanZeroException("age is less than zero");
            }
            else {
                a=10/b; // 10/0 ---> By default an exception
            }
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        catch (AgeLessThanZeroException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
