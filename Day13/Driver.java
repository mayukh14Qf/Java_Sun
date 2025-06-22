package Day13;

public class Driver {
    public static void main(String[] args) {
        // In java, every class extends Object class by default
        // we can override the methods of the object class like toString(),geClass() etc ...
        Student obj= new Student();
        System.out.println(obj); // toString() by default
        System.out.println(obj.toString()); // return type is string
        obj.hi();

        Student obj2= new Student();
        System.out.println(obj2);
        // to get the class name, we use this
        System.out.println(obj2.getClass());
        System.out.println(obj.getClass().getName());

        System.out.println();
        // It will check my objets are equal or not
        System.out.println(obj.equals(obj2));


    }
}
