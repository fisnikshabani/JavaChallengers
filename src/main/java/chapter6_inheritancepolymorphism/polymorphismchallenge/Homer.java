package chapter6_inheritancepolymorphism.polymorphismchallenge;

public class Homer extends SimpsonCharacter{

    @Override
    void drinkBeer(SimpsonCharacter simpsonCharacter) {
        System.out.println("Homer drinks!");
    }
}
