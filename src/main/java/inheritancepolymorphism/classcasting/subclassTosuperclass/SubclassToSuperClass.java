package inheritancepolymorphism.classcasting.subclassTosuperclass;

public class SubclassToSuperClass {

    public static void main(String[] args) {
        Barney barney = new Barney();
        Character characterBarney = barney;
    }

    static class Character{}

    static class Barney extends Character{}
}
