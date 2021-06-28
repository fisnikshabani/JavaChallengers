package inheritancepolymorphism.defaultconstructor;

public class DefaultConstructorInheritance {

    static class Villain{

        Villain(){
            System.out.println("A villain was created!");
        }

        public static void main(String[] args) {
            new Magneto();
        }
    }
}
