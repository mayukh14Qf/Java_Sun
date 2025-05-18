package Day10;

class A{
    //Final for method
    //This method can not be overridden
    // Fixed for parent as well as child
    public final void greet(){
        System.out.println("hi.....");
    }
}

class B extends A{
//    public void greet(){
//
//    }
}

// Final Class can not be inherited
// Final for class
final class C{

}

//class D extends C{
//
//}

public class FinalKeyWord {

    public static void main(String[] args) {
        // Final for variable
        final double pi=3.14;

//        pi=3.37;  (we can not change the value of final or constant

        System.out.println(pi);
    }
}
