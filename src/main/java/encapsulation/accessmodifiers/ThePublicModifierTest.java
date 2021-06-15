package encapsulation.accessmodifiers;

public class ThePublicModifierTest {

    public static void main(String[] args) {

        ThePublicModifier publicModifier = new ThePublicModifier();
        publicModifier.thisMethodIsOpenedToBeAccessed();
        System.out.println(publicModifier.publicAttribute);
    }
}
