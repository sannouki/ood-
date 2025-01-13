public class Customer implements CustomerObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    // Method to receive a notification about a new deal
    public void receiveNotification(String deal) {
        System.out.println(name + " received notification: " + deal);
    }
}