package Day8;

class A{
    public void method1(){
        System.out.println("In A-Method 1");
    }
}
class B extends A{
    // If you want to create a method1() again in B , that will my overriding

    public void method2(){
        System.out.println("In B-Method 2");
    }
}

public class UpAndDownCasting {

    public static void main(String[] args) {

        // Upcasting ------- >
        // Parent ref.Var = new child ();

        B obj1=new B();
        obj1.method2();

        A obj2=new A(); // normal
        A obj3=new B(); // upcasting
        // object from B class ---> Storing in the ref. variable of A
        obj3.method1(); // method2()--------> Can not call that (only parent / A class methods will be there)

        // Down casting
        ((B)obj3).method2();
    }

}
