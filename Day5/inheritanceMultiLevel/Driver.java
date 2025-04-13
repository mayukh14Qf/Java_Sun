package Day5.inheritanceMultiLevel;

public class Driver {
    public static void main(String[] args) {
        Child c1= new Child();
        c1.skinTone();
        c1.smile();
        c1.eyes();
        c1.hair();

        Father f1=new Father();
        f1.smile();
        f1.eyes();
        f1.hair();

        GrandFather gf1=new GrandFather();
        gf1.eyes();
        gf1.hair();
    }
}
