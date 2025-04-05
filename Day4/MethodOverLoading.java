package Day4;

public class MethodOverLoading {
    // Creating -----> multiple methods with same method name but with different signatures
    /*
    1.Return type can be different
    2.No of parameters are different
    3.Type of parameters are different
     void myMethod(float),
     int myMethod(),
     int myMethod(int,String),
     int myMethod(String),
     void myMethod(int,int),
     void myMethod(int),
     */
    // This is also for static method
    public static void myMethod(float f){
        System.out.println("hi my method (float) ");
    }
    public static void myMethod(double d){
        System.out.println("hi my method (double) ");
    }
    public void myMethod(){
        System.out.println("hi my method..");
    }
    public void myMethod(int a){
        System.out.println("hi my method (int) ");
    }
    public int myMethod(int a, int b){
        System.out.println("hi my method (int,int) ");
        return a+b;
    }
    public float myMethod(String a){
        System.out.println("hi my method (String) ");
        return 45.56f;
    }
    public String myMethod(String s,String p){
        System.out.println("hi my method (String,String) ");
        return s+" "+p;
    }

}
