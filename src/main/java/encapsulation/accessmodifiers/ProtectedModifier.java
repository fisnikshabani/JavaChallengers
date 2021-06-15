package encapsulation.accessmodifiers;

public class ProtectedModifier {

    protected String protectedAttribute;

    protected void print(){
        System.out.println("Protected Method! This method is accessible in this package or outside with Inheritance");
    }
}
