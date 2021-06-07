package variablesAndFlowControl;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i++);
        }
        while (i <= 10);

        System.out.println("###################################");

        int j = 99;

        do {
            System.out.println(j++);
        }
        while (j <= 10);
    }
}
