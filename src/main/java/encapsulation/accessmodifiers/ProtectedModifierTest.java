package encapsulation.accessmodifiers;

public class ProtectedModifierTest {
    public static void main(String[] args) {

        ProtectedModifier protectedModifier = new ProtectedModifier();
        System.out.println(protectedModifier.protectedAttribute);
        protectedModifier.print();
    }
}
