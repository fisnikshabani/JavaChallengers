package arrays.multidimensional;

public class BidimensionalArrayChallange {
    public static void main(String[] args) {

        String [][] simpsonFoods = new String[2][2];

        simpsonFoods[0][0] = "Donuts";
        simpsonFoods[1][0] = "Broccoli";
        simpsonFoods[1][1] = "Krysty burger";

        for (int lineIndex = 0, columnIndex; lineIndex < 2; lineIndex++){
            columnIndex = 0;

            while (columnIndex < 2){
                if (simpsonFoods[lineIndex][0] == "Broccoli"){
                    simpsonFoods[lineIndex][columnIndex++] = "Healthy";
                } else {
                    simpsonFoods[lineIndex][columnIndex] = "Junk";
                    break;
                }
            }
        }

        System.out.println(simpsonFoods[0][0] + "|" + simpsonFoods[0][1] + "|" + simpsonFoods[1][0] + "|" + simpsonFoods[1][1]);
    }
}
