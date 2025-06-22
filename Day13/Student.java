package Day13;

public class Student extends Object {
    // data member
    int id=10;
    String name;

    // function members
    public void hi(){
        System.out.println("hi, dostoh ");
    }

    // if I override my toString method, it will print the same , when we call the class, or want to see the attribute
    public String toString(){
        return "id "+id+" name : "+name;
    }

}
