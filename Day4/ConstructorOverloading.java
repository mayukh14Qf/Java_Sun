package Day4;

public class ConstructorOverloading {
    //Data members

    //Constructor Overloading ----->
    // calling Constructor by its name which is same for everything(With my class name)
    // Definition is different------>Constructor(), Constructor(int),Constructor(String),Constructor(int,String),Constructor(int,int),Constructor(int,int,String)
    //Signature will be different--->with different type of parameters and number of parameters
    public ConstructorOverloading(){
        System.out.println("In constructor......");
    }
    public ConstructorOverloading(int para){
        System.out.println("In constructor which has a parameter .....");
    }

    public ConstructorOverloading(int para1,int para2){
        System.out.println("With 2 int parameters ......");
    }
    public ConstructorOverloading(String parameter){
        System.out.println("In constructor which has a string parameter ......");
    }
    public ConstructorOverloading(int a, String b){
        System.out.println("In Constructor which has 2 parameters int , string........");
    }
    public ConstructorOverloading(String a,int b){
        System.out.println("In Constructor which has 2 parameters string, int........");
    }

    // function members
    public void myName(){
        System.out.println("My name is Mayukhjit Chakraborty...");
    }
}
