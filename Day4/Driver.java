package Day4;

public class Driver {

    public static void main(String[] args) {
        //Constructor Overloading
        // new -----> (Object create)
        //Constructor----->Special Method ,which is automatically invoked during object creation
        ConstructorOverloading obj=new ConstructorOverloading();
        obj.myName();
        ConstructorOverloading obj1=new ConstructorOverloading(5);
        obj1.myName();
        ConstructorOverloading obj2=new ConstructorOverloading("abcd");
        obj2.myName();
        ConstructorOverloading obj3=new ConstructorOverloading(78,"qwer");
        obj3.myName();
        ConstructorOverloading obj4=new ConstructorOverloading("qwre",23);

        //Method Over Loading
        MethodOverLoading object=new MethodOverLoading();
        //non-static method
        String var=object.myMethod("mayukhjit","chakraborty");
        System.out.println(var);
        // Static method
        MethodOverLoading.myMethod(45.65f);
        MethodOverLoading.myMethod(4.9);
    }
}
