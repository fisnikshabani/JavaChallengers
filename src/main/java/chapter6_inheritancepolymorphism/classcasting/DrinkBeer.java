package chapter6_inheritancepolymorphism.classcasting;

public class DrinkBeer {

    public static void main(String... drinkBeer) {

        drinkBeer(new Homer());
    }

    static void drinkBeer(Character character ){

        Homer homer = (Homer) character;
        homer.drinkBeer();
    }

    static class Character{

    }

    static class Homer extends Character{

        void drinkBeer(){
            System.out.println("Homer drinks a beer!");
        }
    }
}
