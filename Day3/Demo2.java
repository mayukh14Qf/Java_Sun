package Day3;

/* Constructor
 It is a method (special method) ----> 1. Method==class name
                                       2. it does not have any return type
 */
public class Demo2 {

    String name;
    int roll;
    long phoneNumber;
    String department;

    // constructor
    // default constructor
    public Demo2(){
       System.out.println("This is the constructor.........");
    }
    // parameterized constructor
    public Demo2(int a){
        System.out.println("In Single parameter constructor .....");
    }
    public Demo2(int a, int b){
        roll=a;
        phoneNumber=b;
    }

//    public Demo2(int a,String s, long b,String p){
//        roll=a;
//        name=s;
//        phoneNumber=b;
//        department=p;
//    }

    public Demo2(int roll,String name,long phoneNumber,String department){
        this.roll=roll;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.department=department;
    }

    // Copy Constructor ------ > Taking reference of another class
    public Demo2(Demo3 obj){
        this.roll=obj.studentRoll;
        this.name= obj.fullName;
        this.department=obj.department;
        this.phoneNumber= obj.phoneNumber;
    }

    // normal non-static method
    public void showDetails(){
        System.out.println(name+" "+roll);
    }
}
