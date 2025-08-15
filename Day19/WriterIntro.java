package Day19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterIntro {
    public static void main(String[] args) throws IOException {
//        Writer w= new FileWriter("src/IO/demo6.txt") ;
//        w.write("Hi , My name is mayukhjit ");
//        w.close();

        try (Writer w= new FileWriter("src/IO/demo6.txt")){
            w.write("Hi , My name is mayukhjit, by using auto close ");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
