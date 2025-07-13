package Day15;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int b=sc.nextInt();
        int a=0;
        // If my b is anything less than zero , then show an exception
        // throw --> By using this keyword , we can direct the way of exception
        // By using thi , I can say,  what kind of exception my code should throw and where to throw
        try {
            if(b<0){
                throw new ArithmeticException("b is less than zero"); // the message inside the constructor will show in the console
            }
            else if (b>100){
                throw new RuntimeException("value is greater than 100");
            }
            else {
                a=10/b; // 10/0 ---> By default an exception
            }
        }
        catch (ArithmeticException e) {
            a=10;
            System.out.println(e);
        }
        catch (RuntimeException e){
            System.out.println(e);
        }

    }
}
