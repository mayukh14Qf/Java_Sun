package Day6.globalConstructorChaining;

public class B extends A{
    public B(){
        super("abc");
//        super();// this will call the default constructor of A
        System.out.println("1-->B"
        );
    }
    public B(int a){
//        super();
        System.out.println("2-->B");
    }
}
