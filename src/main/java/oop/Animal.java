package oop;

public class Animal {

    String breed;
    String emittedSound;

    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.breed = "Husky";
        dog.emittedSound = "woof";

        System.out.println(dog.breed);
        System.out.println(dog.emittedSound);

        Animal cat = new Animal();
        cat.breed = "Persian";
        cat.emittedSound = "meow";
        System.out.println(cat.breed);
        System.out.println(cat.emittedSound);
    }
}
