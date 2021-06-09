package arrays;

public class MarioBrosIndexChallenge {
    public static void main(String[] args) {

        String[] marioCharacters = new String[3];

        marioCharacters[1] = "Mario";
        marioCharacters[2] = "Luigi";
        marioCharacters[3] = "Peach";

        for (String characters:marioCharacters) {
            System.out.println(characters);
        }
        // this will print ArrayIndexOutOfBoundsException because it can't access index 3 (marioCharacters[3] = "Peach";)
    }

}
