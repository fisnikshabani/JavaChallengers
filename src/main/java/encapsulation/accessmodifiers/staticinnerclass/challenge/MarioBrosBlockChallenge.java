package encapsulation.accessmodifiers.staticinnerclass.challenge;

public class MarioBrosBlockChallenge {

    {
        System.out.println("instance");
    }

    static {
        System.out.println("static");
    }

    MarioBrosBlockChallenge(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("Jump into");
        new MarioBrosBlockChallenge();
        new MarioBrosBlockChallenge();
        System.out.println("blocks.");
    }
}
