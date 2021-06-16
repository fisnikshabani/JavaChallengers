package inheritancepolymorphism.polymorphismchallenge;

public class Bart extends Homer{

    @Override
    void drinkBeer(SimpsonCharacter simpsonCharacter) {
        System.out.println("Bart can't drink!");
    }
}
