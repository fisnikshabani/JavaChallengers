package oop.objectreferences;

public class MetalGearReference {

    String name;

    public static void main(String[] args) {

        MetalGearReference solidSnake = new MetalGearReference();
        solidSnake.changeSolidName(solidSnake, "Solid Snake");

        MetalGearReference liquidSnake = new MetalGearReference();
        liquidSnake.changeSolidName(liquidSnake, "Liquid Snake");

        System.out.println("1 soldier = " + solidSnake.name + " 2 soldier = " + liquidSnake.name);
    }

    void changeSolidName(MetalGearReference metalGearReference, String name){
        metalGearReference.name = name;
        this.name = "Big Boss";
        metalGearReference = null;
    }
}
