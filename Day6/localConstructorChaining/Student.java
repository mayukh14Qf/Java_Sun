package Day6.localConstructorChaining;

public class Student {
    String name;
    int age;
    String email;

    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public Student(String name,int age,String email){
        this(name,age);
        /*
        this.age=age;
        this.name=name;
         */
        this.email=email;
    }
    public void showDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
