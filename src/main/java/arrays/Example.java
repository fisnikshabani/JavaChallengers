package arrays;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        String[] simpsonCharacterNames = {"Moe", "Burns", "Bart"};
        System.out.println(simpsonCharacterNames[1]);
        System.out.println("simpsonCharacterNames length is: " + simpsonCharacterNames.length);
        System.out.println();

        System.out.println("Using for loop");
        for (int i = 0; i < simpsonCharacterNames.length; i++){
            System.out.println(simpsonCharacterNames[i]);
        }
        System.out.println();

        System.out.println("Using while loop");
        int i = 0;
        while (i < simpsonCharacterNames.length){
            System.out.println(simpsonCharacterNames[i++]);
        }
        System.out.println();

        System.out.println("Using for-each:");
        for (String character: simpsonCharacterNames) {
            System.out.println(character);
        }
        System.out.println();

        System.out.println("Using Streams:");
        Arrays.stream(simpsonCharacterNames).forEach(System.out::println);
        System.out.println();

        int[] simpsonCharacterAges = new int[3];
        simpsonCharacterAges[0] = 35;
        simpsonCharacterAges[1] = 102;
        simpsonCharacterAges[2] = 12;

        System.out.println("Using for-each to print simpsonCharacterAges");

        for (int characterAges:simpsonCharacterAges) {
            System.out.println(characterAges);
        }
    }
}
