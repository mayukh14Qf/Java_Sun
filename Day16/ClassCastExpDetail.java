package Day16;


class A{
    public void name(){
        System.out.println("my name is Mayukhjit");
    }
}
class B extends A   {
    public void Designation(){
        System.out.println("I am a software Buddy");
    }
}

public class ClassCastExpDetail {
    public static void main(String[] args) {

        A obj1= new A();
        B obj2=new B();


        // Upcasting
        A obj3= new B();
       // B obj4=new A(); // Here , My parent does not know about the child ---> This kind of type casting is not possible
//        obj3.designation(); ---> Not callable

        //down casting
        B container= (B) obj3;
        container.Designation();

        // ClassCast Exception -----> Runtime Exception

    }
}
