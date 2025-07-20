package Day16;

interface  CombinationOne{
    void show();
}

interface  CombinationTwo{
    float show();
}

interface  CombinationThree{
    void show(int a, String b);
}

interface  CombinationFour{
    String show(int a, String b);
}


public class LambdaExpressionCombination {
    public static void main(String[] args) {

        // COMBINATION 1
        CombinationOne c1= () -> System.out.println("Hi Combination One");

        // COMBINATION 2
        CombinationTwo c2= () ->24.62f; // Return keyword is not required

        // COMBINATION 3
        CombinationThree c3= (a, b) -> System.out.println("Hi Combination Three "+ b);

        // COMBINATION 4
        // Your operation should be in single line
        // Multi Line Operation is not possible in Lambda
        CombinationFour c4= (x,y) ->
                "Hi I am from combination 4"+ " "+x;

        c1.show();
        System.out.println(c2.show());
        c3.show(10,"hello");
        System.out.println(c4.show(34,"hello"));
    }
}
