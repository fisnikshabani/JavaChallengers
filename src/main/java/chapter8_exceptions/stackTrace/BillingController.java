package chapter8_exceptions.stackTrace;

public class BillingController {

    BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    public static void main(String[] args) {

        BillingController billingController = new BillingController(new BillingService());
        billingController.applyDiscont("1");

    }

    void applyDiscont(String customerId){
        billingService.applyDiscount(customerId);
    }
}

class BillingService{
    void applyDiscount(String customerId){
        throw new RuntimeException();
    }
}
