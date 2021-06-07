package variablesAndFlowControl;

public class ForLoop {
    public static void main(String[] args) {

       // for (; ; System.out.println("This will run forever!"));

        // using break keyword
        for (int i = 0; i <= 10; i++){
            if (i >= 2){
                System.out.println(i);
                break; //the execution of this code will stop when the index is >= to 2
            }
        }

        for (int i = 1; i <= 5; i++){
            if (i >= 3){
                System.out.println("Goku beats one Majin Buu with " + i + " hits");
                //continue;
            }
            System.out.println("Goku hits Majin Buu");
        }

    }
}
