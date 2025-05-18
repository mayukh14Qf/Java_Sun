package Day10;

// abstract method --------> your class should be abstract as well
// A non-abstract method can be there within this abstract class

abstract class Mobile {
    //Data members
    int price=10;
    String title="Best Mobile";

    // Abstract Method
    abstract double description();

    abstract void welcomeMessage();

    // Non-Abstract Method
    public void showTitle(){
        System.out.println(title);
    }
    // Non-Abstract Method
    public void showPrice(){
        System.out.println(price);
    }

}

// Inheritance
class Iphone extends Mobile{
    // Must ------> we should implement the abstract method
    public double description(){
        return price*10;
    }
    public void welcomeMessage(){
        System.out.println("Welcome to Iphone ");
    }
}

class Samsung extends Mobile{
    // Must ------> we should implement the abstract method
    public double description(){
        return price*5;
    }
    public void welcomeMessage(){
        System.out.println("Welcome to Samsung ");
    }
}


public class Abstraction {

    public static void userChoice(Mobile obj){
        System.out.println(obj.description());
    }

    public static void main(String[] args) {
        Iphone obj1=new Iphone();
        userChoice(obj1);

        Mobile obj2=new Samsung();
        System.out.println(obj2.description());
        obj2.showPrice();



    }
}
