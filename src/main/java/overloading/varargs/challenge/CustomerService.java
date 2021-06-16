package overloading.varargs.challenge;

public class CustomerService {

    CustomerDao dao;

    void insert(Customer customer){
        dao.insert(customer);
    }

    void insert(String customerName){
        Customer customer = new Customer(customerName);
        dao.insert(customer);
    }

    void processCustomerProduct(String customerId, String productId, Object o){
        processCustomerProduct(customerId, productId, null);
    }

    void processCustmerProduct(String customerId, String productId, String dicsountId){
        System.out.println("Processing: " + customerId + productId + dicsountId);
    }
}
