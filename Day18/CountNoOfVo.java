package Day18;

import java.io.*;

public class CountNoOfVo {
    public static void main(String[] args) throws IOException {
        InputStream f= new FileInputStream("src/IO/demo4.txt");
        OutputStream o=new FileOutputStream("src/IO/ans.txt");
        PrintStream p= new PrintStream(o);
        String vowels="aeiouAEIOU";
        int count=0;
        while (f.available() != 0){
            char c=(char) f.read();
            if (vowels.contains(String.valueOf(c))){
                count ++;
            }
        }
        p.print("your vowels are : "+count);
        System.out.println("Executed Successfully ....");

    }
}
