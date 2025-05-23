package Day11;

// class should inherit interface
public class ProductImplementation implements Product {

    public int price() {
        return 10000;
    }

    public void description() {
        System.out.println("This is good product");
    }
}
