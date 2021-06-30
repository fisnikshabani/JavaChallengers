package chapter9_lambdas;

import java.util.Arrays;
import java.util.List;

public class MysteriousDoorLambdaChallenge {

    public static void main(String[] args) {

        int doorNumber = 0;
        doorNumber++;

        List<String> doors = Arrays.asList("A","B","C");
        int finalDoorNumber = doorNumber;
        doors.forEach(door -> {
            System.out.println(door + finalDoorNumber); // Lambdas can only access variables that are final or effectively final so this wont compile!
        });
    }
}
