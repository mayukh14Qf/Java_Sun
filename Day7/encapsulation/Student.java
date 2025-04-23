package Day7.encapsulation;

public class Student {

    // Data Members
    private String name;
    private int studentId;
    static int studentIdCount=1;

    // Constructors
    public Student(){
        this.studentId=studentIdCount;
        studentIdCount++;
    }

    // getters and setters functions
    // setter ---> will help us to validate the thing
    public void setName(String name){
        if (name.equals("")){
            System.out.println("enter valid name.......");
        }
        else {
            this.name=name;
        }
    }

    public String getName(){
        return this.name;
    }


    //setters--->
//    public void setStudentId(int studentId){
//        this.studentId=studentId;
//    }
    // getters -->
    public int getStudentId(){
        return this.studentId;
    }


}
