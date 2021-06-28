package chapter7_interfaces;

public class CovariantReturn {

    public static void main(String... dinosaurs ) {
        new Dinosaur().move();
        new Pterodactyl().move();
    }

    static class Dinosaur{
        Object move(){
            return "The Dinosaur is moving...";
        }
    }

    static class Pterodactyl extends Dinosaur{
        @Override
        String move() {
            return "The Pterodactyl is moving in the air.";
        }
    }
}
