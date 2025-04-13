package Day5.inheritanceIntro;

public class Driver {
    public static void main(String[] args) {
        A obj1=new A("Mayukhjit",23);
        System.out.println(obj1.ageEligibility());
        System.out.println(obj1.showPersonalDetails());
        obj1.hello();

        System.out.println("___________________");
        B obj2=new B();
        obj2.hello();
    }
}
