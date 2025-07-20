package Day16;

/*

It is only applicable for functional interface
(When an interface will have only one function)

 */

// functional interface
interface DemoLambda{
    void show();
}

class DemoLambdaImplement implements  DemoLambda{
    public void show(){
        System.out.println("I am showing my colour...");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {

        // Method 1
        DemoLambdaImplement obj1= new DemoLambdaImplement();
        obj1.show();

        // Method 2
        DemoLambda obj2= new DemoLambdaImplement();
        obj2.show();

        // method 3
        DemoLambda obj3= new DemoLambda(){
            public void show(){
                System.out.println("I am showing from anonymous");
            }
        };
        obj3.show();

        // Easiest Way (Lambda Expression)
        /*

        We need to check, That one function inside the interface ---->
        1. return type
        2. The number of arguments it is taking

         */
        DemoLambda obj4= () -> System.out.println("hi, I am from lambda");
        obj4.show();

    }
}
