package Day8.StaicPolymorphism;

public class A {

    // Poly----> Multiple
    // same name but different functionalities
    // 1. Static Polymorphism -------> Compile time Polymorphism
    //2. Dynamic Polymorphism --------> Run Time Polymorphism

    // Static polymorphism-----> Method OverLoading
    // We can use same method name ------> 1.Different Type of the parameters 2. number of the parameters

    public void method(int a){
        System.out.println("method no 1");
    }

    public void method(String s){
        System.out.println("method no 2");;
    }

    public void method(int a, int b){
        System.out.println("method no 3");
    }

}
