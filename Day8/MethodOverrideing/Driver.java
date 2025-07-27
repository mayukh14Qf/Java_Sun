package Day8.MethodOverrideing;

public class Driver {
    public static void main(String[] args) {
        Child obj1= new Child();
        obj1.hair();
        obj1.name();
        obj1.name(23);
    }
}
