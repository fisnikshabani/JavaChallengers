package encapsulation.accessmodifiers;

public class LessRestrictiveModifiersExecutor extends LessRestrictiveModifiers{

    public static void main(String[] args) {
        LessRestrictiveModifiers challenger = new LessRestrictiveModifiers();

        System.out.println(challenger.publicVariable);
        System.out.println(new LessRestrictiveModifiersExecutor().protectedVariable);
    }
}
