package Day2;

//Blue-print is ready
public class Student {
    // Properties or Data Members
    // For particular College
    String firstName;
    String lastName;
    String email;
    long mobileNo;
    int rollNo;
    String universityName;

    // Behaviors or Function Member
    public void showStudentDetails(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(rollNo);
        System.out.println(mobileNo);
        System.out.println(universityName);
    }

    public String showFullName(){
        return firstName+lastName;
    }

    public void showContactDetails(){
        System.out.println(mobileNo);
        System.out.println(email);
    }
}
