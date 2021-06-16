package overloading.varargs.challenge;

public class DiscountController {

    DiscountService discountService = new DiscountService();

    boolean isDiscountAvailable(String customerID) {
        return discountService.isDiscountAvailable(customerID);
    }

    boolean isDiscountAvailable(String customerID, String userName){
        System.out.println("CustomerID: " + customerID + "Username: " + userName);
        return isDiscountAvailable(customerID);
    }

}
