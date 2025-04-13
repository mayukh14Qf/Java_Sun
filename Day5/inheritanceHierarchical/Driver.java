package Day5.inheritanceHierarchical;

public class Driver {
    public static void main(String[] args) {
        C c1=new C();
        c1.f1(); // Method from class A
        c1.f3(); // own method
        // c1.f2()---->Not possible

        B b1=new B();
        b1.f2();
        b1.f1();
    }
}
