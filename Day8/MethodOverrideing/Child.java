package Day8.MethodOverrideing;

public class Child extends Parent{
    public void name(){
        System.out.println("My name is abc");
//        int a=10;
//        a=40;
    }

    // hair() , name (int a)

    public void name(float b){
        System.out.println("My name is abc");
    }

}
