package Day3;

public class Demo1 {

    // Data members ------- > variable
    static String staticName;
    int a;
    int b;
    String s;

    // static method  ---- > we can use static var
    public static void staticMethod(){
        System.out.println("this is the static method");
//        System.out.println(a); // why ---->
        System.out.println(staticName);
    }

    // Non-static method ---> static var and non static
    public void showDetails(){
        System.out.println(a+" "+b+" "+s+" "+staticName);
    }


}
