package inheritancepolymorphism.modifierrestriction;

public class Object {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o);
    }

    @Override
    public String toString() {
        return  getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
