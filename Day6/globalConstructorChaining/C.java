package Day6.globalConstructorChaining;

public class C extends B{
    public C(){
        super();// This will call the constructor of its parent class (default)
        System.out.println("1-->C"
        );
    }
    public C (String s){
        super();
        System.out.println("2-->C");
    }
}
