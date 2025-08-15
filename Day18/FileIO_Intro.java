package Day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIO_Intro {
    public static void main(String[] args) throws IOException {
        FileOutputStream f= new FileOutputStream("src/IO/demo1.txt"); // This creates the file if does not exist

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String s= sc.nextLine(); // my name is mayukhjit.

        // Method 1
//        for (int i=0;i<=s.length()-1;i++){
//            f.write(s.charAt(i));
//        }

        // method 2
        byte [] arr=s.getBytes();
        f.write(arr);

//        f.write('a');
//        f.write(' ');
//        f.write(65);

        f.close();

    }
}
