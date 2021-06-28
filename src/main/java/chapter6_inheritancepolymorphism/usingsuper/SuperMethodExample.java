package chapter6_inheritancepolymorphism.usingsuper;

public class SuperMethodExample {

    public static void main(String[] args) {
        new Homer().drinkBeer();
    }

    static class Character{
        void move(String name){
            System.out.println(name.concat(" is walking!"));
        }
    }

    static class Homer extends Character{
        void drinkBeer(){
            super.move("Homer");
        }
    }
}
