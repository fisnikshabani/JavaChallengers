package chapter6_inheritancepolymorphism.defaultconstructor;

public class CustomizedConstructorSuper {

    public static void main(String[] args) {

        new Moe();

    }

    static class Character{
        Character(String name){
            System.out.println (name + " was invoked!");
        }
    }

    static class Moe extends Character {
        Moe(){
            super("Moe Szyslak");
        }
    }

}
