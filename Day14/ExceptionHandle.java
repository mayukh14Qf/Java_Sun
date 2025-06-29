package Day14;

import java.io.IOException;

public class ExceptionHandle {
    public static void main(String[] args)  {

        // Unchecked Exception

        int [] arr= new int[3];

        // Handle the exception
        /*
        1. try catch
        2.duck the exception , by using throws
         */

        try {
            arr[6]=90;
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        arr[5]=7;
        System.out.println("Hi, Done");


        // Ducking to handle
        DemoExp obj= new DemoExp();
        try {
            obj.see();
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
