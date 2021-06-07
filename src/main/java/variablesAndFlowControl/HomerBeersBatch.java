package variablesAndFlowControl;

public class HomerBeersBatch {
    public static void main(String[] args) {

        int batchOfBeer1 = 5;
        int batchOfBeer2 = 5;

        // here only the first condition will be checked, therefore only batchOfBeer2 will be incremeted!
        if (++batchOfBeer2 > batchOfBeer1 || batchOfBeer1++ == batchOfBeer2++){
            batchOfBeer1++;
        }

        // the batchOfBeer1 will be incremented ONLY after the condition is checked, so the "else" condition will be fulfilled and the third operator will be evaluated.
        //batchOfBeer2 is pre-incremented and it's value is 7, it will be assigned to batchOfBeer1
        batchOfBeer1 = (batchOfBeer1++ > batchOfBeer2 && ++batchOfBeer2 < batchOfBeer1++ ? ++batchOfBeer1 : ++batchOfBeer2);

        System.out.println("Homer will have: " + batchOfBeer1-- + " and " + batchOfBeer2++ +" beers.");
    }
}
