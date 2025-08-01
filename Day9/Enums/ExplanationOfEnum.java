package Day9.Enums;

enum StudentType{
    male,female,Others
}
enum Day{
    sunday(1),
    monday(2),
    tuesday(3),
    wednesday(4),
    thursday(5),
    friday(6),
    saturday(7);
    int dayCount;
    // need to make constructor -----> same number count---> arguments
    Day(int dayCount){
        this.dayCount=dayCount;
    }

}

public class ExplanationOfEnum {
    public static void main(String[] args) {
        // short form of " Enumerations" ------> Series of User Defined Constant
        StudentType var=StudentType.male;
        StudentType var1=StudentType.female;
        System.out.println(var);
        System.out.println(var1);
        if (var==StudentType.male){
            System.out.println("He is male");
        }

        StudentType [] arr=StudentType.values(); // This is an array of StudentType

        for (StudentType ele : arr){
            System.out.println(ele);
        }

        Day day1=Day.monday;
        System.out.println(Day.saturday.dayCount);
        System.out.println(day1);
        System.out.println(day1.dayCount);

    }
}
