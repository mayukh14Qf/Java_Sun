package Day6.localConstructorChaining;

public class Driver {
    public static void main(String[] args) {
        A obj1=new A(10);
//        A obj2=new A("abc");

        // I want to Invoke Both constructor 2 and 3 when
        // I am creating the object by using constructor 3
        // Local Constructor Chaining

        Student s1= new Student("mayukhjit",23);
        s1.showDetails();
        Student s2=new Student("Amisha",22,"ap2gmail.com");
        s2.showDetails();

    }
}
