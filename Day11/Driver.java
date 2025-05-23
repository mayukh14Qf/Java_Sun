package Day11;

public class Driver {
    public static void main(String[] args) {

        Product object= new ProductImplementation();
        System.out.println(object.price());
        object.description();

        ProductImplementation objectTwo=new ProductImplementation();
        System.out.println(objectTwo.price());
        objectTwo.description();

    }
}
