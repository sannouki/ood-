//uses observer pattern to subscribe customers to deals
import java.util.ArrayList;
import java.util.List;

public class BlackFridayDeals {
    private List<Customer> subscribedCustomers = new ArrayList<>();
    private List<Customer> allCustomers = new ArrayList<>();

    // Method to add a customer to the list of all potential customers
    public void addtoAllCustomer(Customer customer) {
        if (!allCustomers.contains(customer)) { // If the customer hasn't subscribed before, add them to the list of every customer that has subscribed
            allCustomers.add(customer);
        }
    }
    
    // Method to subscribe a customer to the deals
    public void subscribe(Customer customer) {
        if (!subscribedCustomers.contains(customer)) { // Make sure to not add the same customer twice
            subscribedCustomers.add(customer);
        }
    }

    // Method to unsubscribe a customer from the deals
    public void unsubscribe(Customer customer) {
        subscribedCustomers.remove(customer);
    }

    // Method to notify all subscribed customers about a new deal
    public void notifyCustomers(String deal) {
        for (int i = 0; i < subscribedCustomers.size(); i++) {
            subscribedCustomers.get(i).receiveNotification(deal);
        }
    }

    //check if customers are subscribed
    public void checkSubscriber() {
        for (int i = 0; i < allCustomers.size(); i++) {
            Customer customer = allCustomers.get(i);
            if (!subscribedCustomers.contains(customer)) {
                System.out.println("customer "+ customer.getName() + " is not subscribed to deal notifications.");
            }
        }
    }
}