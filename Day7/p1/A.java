package Day7.p1;

public class A {
    public int var1=10; // public
    protected  int var2=20; // protected
    int var3=30; // default
    private int var4=40; // private

    public static void main(String[] args) {
        A obj1=new A();
        System.out.println(obj1.var1);
        System.out.println(obj1.var2);
        System.out.println(obj1.var3);
        System.out.println(obj1.var4);
    }

}
