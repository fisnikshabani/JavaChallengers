package overloading.varargs.challenge;

public class DiscountService {

    boolean isDiscountAvailable (String customerID){
        System.out.println("Discount available to " + customerID);
        return true;
    }
}
