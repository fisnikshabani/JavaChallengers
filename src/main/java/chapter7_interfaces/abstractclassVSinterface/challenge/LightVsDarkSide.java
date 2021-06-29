package chapter7_interfaces.abstractclassVSinterface.challenge;

public class LightVsDarkSide {

    public static void main(String[] args) {

        Object object = new ObiWan(){

            int attackPower = 9999;

            Object jump(){
                attackPower = 999999;
                return attack(attackPower);
            }
        }.jump();

        System.out.println(object);

        DarthMaul darthMaul = new DarthMaul() {
            int defencePower = 99999;

            public void useSaber(){
                System.out.println("Darthmaul loses the saber and defends with the power of " + defencePower);
            }
        };

        darthMaul.useSaber();
    }

    abstract static class ObiWan{
        Object attack(int attackPower){
            return "ObiWan attacks DarthMaul with the power of " + attackPower;
        }
    }

    interface DarthMaul{

        default void useSaber(){
            System.out.println("DarthMaul uses the saber");
        }
    }
}
