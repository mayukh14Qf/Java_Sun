package Day18;

import java.io.*;

public class EliminateAllTheVo {
    public static void main(String[] args) throws IOException {
        InputStream f= new FileInputStream("src/IO/demo4.txt");
        String vowels="aeiouAEIOU";
        String allWithOutVowels="";
        while (f.available() != 0){
            char c=(char) f.read();
            if (!vowels.contains(String.valueOf(c))){
                allWithOutVowels = allWithOutVowels+ c;
            }
        }
        OutputStream o= new FileOutputStream("src/IO/demo4.txt");
        PrintStream p= new PrintStream(o);
        p.print(allWithOutVowels);
        System.out.println("Executed Successfully");
    }
}
