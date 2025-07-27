package Day8.StaicPolymorphism;

public class Driver {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.method(4);
        obj1.method(4,5);
        obj1.method(12,34,56);
    }
}
