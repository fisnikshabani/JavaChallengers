package inheritancepolymorphism.typeofobject;

public class InstanceOfExample {

    public static void main(String[] args) {

        Object xavier = new Xavier();
        System.out.println(new Venom() instanceof Object); //true
        System.out.println(xavier instanceof Xavier && xavier instanceof Object); //true
        System.out.println(new Wolverine() instanceof  Hero); //true
        System.out.println(new Hero() instanceof Wolverine); //false
    }
}
