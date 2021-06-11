package oop.objectreferences;

public class Challenger {

    int level;

    public static void main(String[] args) {

        Challenger challenger = new Challenger();
        challenger.level = 7;

        challenger.changeLevel();

        Challenger alternativeChallenger = challenger;

        alternativeChallenger.level = 12;

        System.out.println(challenger.level);
        System.out.println(alternativeChallenger.level);

    }

    void changeLevel(){
        this.level = 9;
    }
}
