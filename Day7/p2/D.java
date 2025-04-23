package Day7.p2;
import Day7.p1.*;
public class D extends A{

    public static void main(String[] args) {
//        A obj1=new A();
//        System.out.println(obj1.var1);
//        System.out.println(obj1.var2);
//        System.out.println(obj1.var3);
//        System.out.println(obj1.var4);

        // if a class inherits another class then all the public and protected members (data or function)
        // could be accessible from the child class but , for private and default it is not possible

        D obj2= new D();
        System.out.println(obj2.var1);
        System.out.println(obj2.var2);
//        System.out.println(obj2.var3);
//        System.out.println(obj2.var4);

    }
}
