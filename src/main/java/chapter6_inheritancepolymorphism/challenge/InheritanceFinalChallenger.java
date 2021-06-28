package chapter6_inheritancepolymorphism.challenge;

public class InheritanceFinalChallenger {

    private static int damage;

    public static void main(String[] args) {

        Character ironman = new IronMan();
        ironman.attack();

        ((IronMan)ironman).protonCannon();

        Character spiderman = new Spiderman();
        spiderman.attack();

        System.out.println(damage);

        ((IronMan)spiderman).protonCannon();

    }

    static abstract class Character{
        Character(){
            damage++;
        }

        abstract void attack();
    }

    static class Spiderman extends Character{

        void attack(){
            new Spiderman();
            System.out.println("Spider-Web");
        }
    }

    static class IronMan extends Character{

        Armor armor = new Armor();

        void protonCannon(){
            System.out.println("Strike!");
        }

        void attack(){
            System.out.println("Proton Cannon");
            armor.standingLight();
        }
    }

    static class Armor{
        void standingLight(){
            System.out.println("-------->>>>>>>>>>");
        }
    }
}
