package Day6.localConstructorChaining;

public class A {

    public A(){
        System.out.println("1");
    }
    public A(String s){
        this();
        System.out.println("2");
    }
    public A(int a){
        this("hi");  // that has to be in first line
//        this();
//        this(10,"bca");
        System.out.println("3");
    }
    public A(int a,String s){
        System.out.println("4");
    }
}
