package oop.constructors;

public class SimpsonCharacter {

    String name;

    public SimpsonCharacter(String name) {
        this.name = name;
    }

    public SimpsonCharacter() {
    }

    public static void main(String[] args) {

        new SimpsonCharacter("Homer");

        new SimpsonCharacter();
    }
}
