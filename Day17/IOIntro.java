package Day17;
import java.io.*;
public class IOIntro {
    public static void main(String[] args) throws IOException{
        InputStream obj= new FileInputStream("src/IO/demo"); // To fetch the file content
       /*
        System.out.println(obj.available());
        System.out.println((char) obj.read()); // read the first character----> ascii value
        System.out.println(obj.available());
        System.out.println((char) obj.read());

        */

        //Method 1 (print all the content)
//        while(obj.available() != 0){
//            System.out.print((char) obj.read());
//        }
        
        // Method 2 of printing all the content of a file
        int ch;
        while ((obj.read()) != -1){
            System.out.print((char) (obj.read()));
        }

        obj.close(); // This will stop the connection
    }
}
