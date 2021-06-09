package arrays;

public class ScopeChallenge {
    public static void main(String[] args) {

        boolean isHomerFat = true;
        {
            String homerFavoriteBeer = "Duff";
        }

        if (isHomerFat){
            String homerFavoriteFood = "Doughnuts";
            for (int beerQuantity = 0; beerQuantity <= 10; beerQuantity++)
                if (isHomerFat)
                System.out.println(beerQuantity);
                System.out.println(homerFavoriteFood);
                System.out.println(isHomerFat);
        }
    }
}
