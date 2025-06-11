package Day12;

class Example{
    //Data Member
    int variableOne=10;
    static int variableTwo=20;

    // I want to run my this set of codes only once
    //It will run in the beginning of any object creation
    //During class loading, irrespective of number of objects
    static {
        System.out.println("Hi I am in static Block...");
    }

    //Constructor
    public Example(){
        System.out.println("Hi I am Example() constructor ...");
    }



    // Function Member
    public void myMethod(){
        System.out.println("This is my method...");
    }

}


public class StaticBlock {
    public static void main(String[] args) {

        // class loading ---> Whenever we are creating the first object
        Example e1= new Example();
        e1.myMethod();

        Example e2=new Example();
        e2.myMethod();

        System.out.println(Example.variableTwo);
    }
}
