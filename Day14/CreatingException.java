package Day14;


import java.io.FileInputStream;
import java.io.IOException;

public class CreatingException {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream("src/Day14/CreatingException.java");
        System.out.println("gjgada");


        // Runtime Exception ------>You do not need to mention
        String demo="abc";
        System.out.println(demo.charAt(4));
        int arr[] = new int[3];
        arr[4]=23;
        int a=2/0;


    }
}
