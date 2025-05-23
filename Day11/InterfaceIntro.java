package Day11;

interface ImportantInterface{

    // data members
     int variable=10; // public final static variable
    // functions-----> that belongs to only abstract function.

    void greet(); // by default this is public abstract
    int count(); // by default this is public abstract

}

// Implementing the methods of interface
// class ----> class (inherit) -----> extends keyword
// class---->interface(inherit) -------> implements keyword
// interface -----> interface(inherit)-----> extends keyword
class ImplementingClass implements ImportantInterface{
    // Method overriding
    public void greet(){
        System.out.println("Hi, Welcome to Java Class");
    }
    public int count(){
        return 2;
    }
}

public class InterfaceIntro {

    public static void main(String[] args) {
        System.out.println(ImportantInterface.variable);
//        ImportantInterface.variable=19;
//        ImportantInterface object= new ImportantInterface();

        // Method 1
        // Runtime polymorphism
        ImportantInterface object= new ImplementingClass();
        System.out.println(object.count());
        object.greet();
        // Method 2
        ImplementingClass objectOne=new ImplementingClass();
        System.out.println(objectOne.count());
        objectOne.greet();
    }
}
