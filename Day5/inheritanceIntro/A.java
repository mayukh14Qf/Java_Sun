package Day5.inheritanceIntro;

// child class or derived class
public class A extends B{
    // data members
    String name;
    int age;

    //Constructor
    public A(String name,int age){
        this.name=name;
        this.age=age;
    }

    // function members
    public String showPersonalDetails(){
        return "Your name is "+name;
    }
    public boolean ageEligibility(){
        if (age>18){
            return true;
        }
        else {
            return false;
        }
    }

}
