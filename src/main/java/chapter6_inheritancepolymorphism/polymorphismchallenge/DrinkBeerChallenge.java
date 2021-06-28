package chapter6_inheritancepolymorphism.polymorphismchallenge;

public class DrinkBeerChallenge {

    public static void main(String[] args) {

        SimpsonCharacter bart = new Bart();
        drinkBeer(bart);
        drinkBeer(new Homer());
        drinkBeer(new SimpsonCharacter());

    }

    static void drinkBeer(SimpsonCharacter simpsonCharacter){
        simpsonCharacter.drinkBeer(simpsonCharacter);
    }
}
