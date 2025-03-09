package Day1;

// Class is a blueprint (Core Structure)
// Laptop As Blueprint (It is same from the structural View)
public class Laptop {

    // 1)Specifications OR Properties
    // Color,Price,Size,Company Name
    // Fields or variable members

    String companyName="Lenovo";
    String color="red";
    double price=20000.34;
    int size;

    // 2) Behaviors or Functions
    // GamingAbility, Coding, Meeting
    // Function Member

    public void isCoding(){
        System.out.println("I am coding");
    }

    public void showSpecifications(){
        System.out.println(companyName);
        System.out.println(color);
        System.out.println(price);
        System.out.println(size);
    }

}
