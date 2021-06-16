package inheritancepolymorphism.overridingInheritedMethods;

public class HeroExecutor {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.usePower();

        Hero spiderMan = new Spiderman();
        spiderMan.usePower();

        Hero wolverine = new Wolverine();
        wolverine.usePower();
    }
}
