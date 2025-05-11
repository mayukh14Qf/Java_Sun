package Day9.RuntimePolymorphism;


class parent{
    public void method(){
        System.out.println("In Parent..");
    }
}
class child1 extends parent{
    public void method(){
        System.out.println("In Child 1..");
    }
    public void method1(){
        System.out.println("In child 1 ");
    }
}
class child2 extends parent{
    public void method(){
        System.out.println("In Child 2..");
    }
}
class child3 extends parent{
    public void method(){
        System.out.println("In child 3..");
    }
}




public class RunPoly {

    public static void show(parent p){
        p.method();
    }

    public static void show1(child1 c1){
        c1.method();
    }

    public static void main(String[] args) {
        // Method Overriding
        child1 obj1=new child1();
        obj1.method();
        //Upcasting
        parent obj2=new child1();
        //Dynamic / Run time Polymorphism ---->Up casting + method overriding
        obj2.method();

        show(new parent()); // it will call method() from parent
        show(new child1()); // it will call method() from child1
        show(new child2()); // it will call method() from child2
        show(new child3());

        show1(new child1());
       // show1(new child2()); -----> It will only take child1 object

    }
}
