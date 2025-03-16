package Day2;

public class Employee {
    int empId;
    String empName;
    // Constant , It will belong to the Class itself
    static String empCompany="TCS";

    public void empDetails(){
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(empCompany);
    }

    public static void main(String[] args) {

        Employee.empCompany="TCS_2015";

        Employee e1= new Employee();
        e1.empDetails();
//        e1.empCompany="TCS_2015";// (Not possible)


        System.out.println("_______________");

        Employee e2=new Employee();
        e2.empDetails();

    }

}
