package encapsulation.accessmodifiers.staticinnerclass;

public class StaticMethod {

    public static void main(String[] args) {
        StaticMethod.print();
    }

    static void print(){
        System.out.println("Static method, no instance required!");
    }
}
