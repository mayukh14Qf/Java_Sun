package Day1;

public class Driver {
    // If we are not including the main() , class will be compiled ,but it will not be executed
    public static void main(String[] args) {
        // Object -----> Real Life Entity Which is an instance of a class (Laptop,Pencil,Phone,Student)
        System.out.println(new Laptop().size); // Obj1
        System.out.println(new Laptop().price); //Obj2
        new Laptop().showSpecifications(); //Obj3
        new Laptop().isCoding(); //Obj4
    }
}
