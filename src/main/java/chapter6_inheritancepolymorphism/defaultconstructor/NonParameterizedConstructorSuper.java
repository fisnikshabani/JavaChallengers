package chapter6_inheritancepolymorphism.defaultconstructor;

public class NonParameterizedConstructorSuper {

    public static void main(String[] args) {

        new Moe();
    }

    static class Character{
        Character(){
            System.out.println("A character was created");
        }

        Character(String name){
            System.out.println(name + " was created!");
        }

    }

    static class Moe extends Character{

    }
}
