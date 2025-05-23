package Day11;

interface ParentOne{
    void context(int a);
    void hello();
}
interface ParentTwo{
    void value();
    void hello();
    int hello(int a);
}
// trying to achieve multiple inheritance
class Child implements ParentOne,ParentTwo{

    public void context(int a) {
        System.out.println("Context is : "+a);
    }

    public void value() {
        System.out.println("It has high value");
    }

    public void hello() {
        System.out.println("Hi parents...");
    }

    public int hello(int a) {
        return a;
    }
}


public class MultipleInheritanceObtainingUsingInterface {
    public static void main(String[] args) {
        Child c= new Child();
        c.context(12);
        c.hello();
        System.out.println(c.hello(12));
        c.value();

        ParentOne p1=new Child();
        p1.context(12);
        p1.hello();

        ParentTwo p2=new Child();
        p2.hello();
        p2.value();
        System.out.println(p2.hello(13));
    }
}
