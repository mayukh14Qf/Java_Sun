package Day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamIntro {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your string : ");
        String s= sc.nextLine();
        String s1= sc.nextLine();

        FileOutputStream f= new FileOutputStream("src/IO/demo3.txt");
        PrintStream p= new PrintStream(f);

        p.println(s);
        p.print(s1);

        f.close();
    }
}
