package chapter6_inheritancepolymorphism.trickyobjectchallenge;

public class TheTrickyObjectClass {

    public static void main(String[] args) {
        System.out.println(new NoBeerException() instanceof Object ? "1" : "0");
        System.out.println(new Barney() instanceof Object ? "1" : "0");
        System.out.println(Barney.class instanceof Object ? "1" : "0");
        System.out.println(Class.class instanceof Object ? "1" : "0");
    }
}
