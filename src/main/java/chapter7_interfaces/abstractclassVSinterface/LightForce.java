package chapter7_interfaces.abstractclassVSinterface;

public abstract class LightForce {

    private int force;

    public LightForce(int force) {
        this.force = force;
        System.out.println("The force is being used: " + this.force);
    }

    public static void main(String[] args) {

        new LukeSkywalker(1099);
        new DarthVader().useForce();

    }

    interface DarkForce{
        int FORCE = 999;

        default void useForce(){
            System.out.println("The force is being used: " + FORCE);
        }
    }

    static class LukeSkywalker extends LightForce{

        public LukeSkywalker(int force) {
            super(force);
        }
    }

    static class DarthVader implements DarkForce{

    }
}
