package Day7.encapsulation;

public class Driver {
    public static void main(String[] args) {

        // Object 1
        Student obj1= new Student();
        obj1.setName("mayukhjit");

        System.out.println(obj1.getStudentId());
        System.out.println(obj1.getName());

        // Object 2
        Student obj2= new Student();
        obj2.setName("Ashmita");

        System.out.println(obj2.getStudentId());
        System.out.println(obj2.getName());



    }
}
