package Day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StoreLinesIntoFile {
    public static void main(String[] args) throws IOException {
        /*

        store 3 individual lines to the file (user input)

         */

        FileOutputStream f= new FileOutputStream("src/IO/demo2.txt");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number of lines : ");
        int line= sc.nextInt();
        sc.nextLine();

        int i=0;
        while (i<line){
            String s=sc.nextLine();
            s=s+"\n";
           // byte[] arr= s.getBytes();
            f.write(s.getBytes());
            i++;
        }

        System.out.println("Completed");

        f.close();

    }
}
