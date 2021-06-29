package chapter7_interfaces;

public class JodaForce {

    public static void main(String[] args) {
        System.out.println(new Yoda().useSaber());
        System.out.println(new Yoda().attack());
        System.out.println(new Yoda().lightForce);

    }

    static abstract class LightForce{
        int lightForce;

        abstract Object useSaber();
        abstract long attack();

        LightForce(){
            lightForce++;
        }
    }

    static class Yoda extends LightForce{

        @Override
        String useSaber() {
            return "useSaber";
        }

        long attack(){
            return 99999;
        }
    }
}
