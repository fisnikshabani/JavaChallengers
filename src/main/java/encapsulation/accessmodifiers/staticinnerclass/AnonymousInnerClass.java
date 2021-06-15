package encapsulation.accessmodifiers.staticinnerclass;

public class AnonymousInnerClass {

    public static void main(String[] args) {

        new AnonymousInnerClass(){

            private void printSomethingElse(){
                System.out.println("Printing form the anonymous Inner Class");
            }
        }.printSomethingElse();
    }

    private void print(){
        System.out.println("Print something!");
    }
}
