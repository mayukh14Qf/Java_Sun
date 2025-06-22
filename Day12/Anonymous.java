package Day12;
interface College{
    int hello();
    void hi();
}

class CollegeImplement implements College{
    public int hello() {
        return 10;
    }

    public void hi() {
        System.out.println("hiii");
    }
}

public class Anonymous {
    public static void main(String[] args) {

        // Object Creation
        //Method 1
        College c= new CollegeImplement();
        System.out.println(c.hello());
        c.hi();

        // Method 2
        CollegeImplement ci= new CollegeImplement();
        System.out.println(ci.hello());
        ci.hi();

        // Method 3 (Anonymous Creation)
        // I am not Implementing the interface by using other class
        // we are implementing during runtime
        College c1= new College(){
            public int hello() {
                return 20;
            }
            public void hi() {
                System.out.println("Hi 2");
            }
        };
        System.out.println(c1.hello());
        c1.hi();
    }
}
