package encapsulation.accessmodifiers.staticinnerclass;

public class StaticAttribute {

    static String staticEnergy;

    public static void main(String[] args) {
        StaticAttribute.staticEnergy = "Very Strong";
        System.out.println(staticEnergy);
    }
}
