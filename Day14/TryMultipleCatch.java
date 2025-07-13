package Day14;

import java.util.Scanner;

public class TryMultipleCatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int b=sc.nextInt();
        int a;
        int [] arr= new int[3];
        // Only one catch block will be executed
        // we can not place ArithmeticException after Runtime ----> Child --> parent --> grandparent

        try {
            arr[4]=90;  // do not put 2 exceptions in a single try block
            try{
                a=10/b;// we need to use nested try catch or multiple try catch
            }
            catch (Exception e){
                System.out.println("in nested");
            }
        }

        catch (ArithmeticException e){
            System.out.println("Catch 1");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch array");
        }
        catch (RuntimeException e){
            System.out.println("catch 2");
        }
        catch (Exception e){
            System.out.println("Catch 3");
        }

    }
}
