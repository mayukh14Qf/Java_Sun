package Day2;

public class Driver {
    public static void main(String[] args) {
        //Creating the copies
        System.out.println(new Student()); // Object1
        System.out.println(new Student()); // Object2

        // Reference Variable
        // Container which contains the object of a class

        Student var1=new Student(); // Object3
        System.out.println(var1);
        var1.firstName="Amisha";
        var1.lastName="Islam";
        var1.email="ai@gmail.com";
        var1.rollNo=23;
        var1.mobileNo=8420577164L;
        var1.universityName="GMIT";
        var1.rollNo=14;

        Student var2=new Student(); // Object4
        var2.firstName="Nirmalya";
        var2.lastName="Ghosh";
        var2.email="ng@gmail.com";
        var2.universityName="SVU";

        var1.showStudentDetails();
        System.out.println(var1.showFullName());
        System.out.println(var1.firstName);
        System.out.println("____________________");
        var2.showStudentDetails();
        System.out.println(var2.showFullName());
        System.out.println(var2.universityName);
        System.out.println("____________________");
        Student s1=new Student();
        s1.firstName="Archisman";
        // s1 ---> lastName,email,universityName == null
        // s1 -----> mobileNo,rollNumber==Zero
        s1.showContactDetails();









    }
}
