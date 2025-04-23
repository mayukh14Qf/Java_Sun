package Day7.p1;

public class B {
    // Same package but different class
    public static void main(String[] args) {
        A obj1=new A();
        System.out.println(obj1.var1);
        System.out.println(obj1.var2);
        System.out.println(obj1.var3);
        //System.out.println(obj1.var4); // Private -----> Not Possible
    }
}
