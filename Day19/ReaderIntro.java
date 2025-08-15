package Day19;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderIntro {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("src/IO/demo4.txt");
        System.out.println("are you ready ? "+r.ready());

        char [] arr= new char[100];

        //System.out.println((char)r.read()); // It is like InputStream
        r.read(arr); // reads all the characters and store those to arr array
        for (char ele : arr){
            if ((int)ele != 0){
                System.out.print(ele);
            }
        }
        System.out.println(r.ready());
        r.close();

    }
}
