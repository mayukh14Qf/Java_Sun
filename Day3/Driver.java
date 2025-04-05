package Day3;

public class Driver {

    public static void main(String[] args) {

        Demo3 o= new Demo3();
        o.department="ECE";
        o.phoneNumber=4567993L;
        o.studentRoll=79;
        o.fullName="Asmita";

        // Copy the value of demo three inside the demo2 attributes
        Demo2 var5=new Demo2(o);
        var5.showDetails();

        // It Will be automatically invoked during the object creation ( by using new keyword)
        Demo2 var4=new Demo2(12,"Mayukhjit",456789L,"CSE");
        // here you will see all the values will be initialised
        var4.showDetails();

        //Types of constructors
        Demo2 var1= new Demo2();
        Demo2 var2=new Demo2(45);
        Demo2 var3=new Demo2(7,9);
        var3.showDetails();


        // static method or static var ----> belongs to class , we do not need object
        Demo1.staticName="This is value";
        Demo1.staticMethod();

        // non-static method or var --- > it needs object to access
        Demo1 obj1= new Demo1();
        obj1.a=12;
        obj1.b=13;
        obj1.s="demo1 obj1";
        obj1.showDetails();

        Demo1 obj2=new Demo1();
        obj2.a=2;
        obj2.b=3;
        obj2.s="demo1 obj2";
        obj2.showDetails();
    }
}
