public class Main {
    public static void main(String[] args) {
        System.out.println("Product Catelog:");
        //create categories
        Category blackFridayDealsCategory = new Category("Black Friday Deals");
        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");

        // Create individual products (electronics)
        Product laptop = new Product("Laptop", 799.99);
        Product smartPhone = new Product("Smartphone", 499.99);
        Product headPhone = new Product("Headphone", 99.99);
        //(clothings)
        Product jacket = new Product("jacket", 59.99);
        
        // Add subcategories to the blackfriday deals
        blackFridayDealsCategory.add(electronics);
        blackFridayDealsCategory.add(clothing);
    // Add products/leaf element to the categories
        //electronics
        electronics.add(laptop);
        electronics.add(smartPhone);
        electronics.add(headPhone);
        //(clothings)
        clothing.add(jacket);

        
        //creating customers 
        Customer customer1 = new Customer("V");
        Customer customer2 = new Customer("JK");
        Customer customer3 = new Customer("Jimin");

        // Display product categories
        blackFridayDealsCategory.display();


        //subscriber instance 
        BlackFridayDeals subscribedCustomers = new BlackFridayDeals();

        //add customers to all customers list
        subscribedCustomers.addtoAllCustomer(customer1);
        subscribedCustomers.addtoAllCustomer(customer2);
        subscribedCustomers.addtoAllCustomer(customer3);

        //subscribe customers to blackfriday deals
        subscribedCustomers.subscribe(customer1); //v
        subscribedCustomers.subscribe(customer2); //jk
        subscribedCustomers.subscribe(customer3); //jimin
        subscribedCustomers.subscribe(customer3); //jimin
        subscribedCustomers.subscribe(customer3); //jimin
        System.out.println(" ");
        //Trigger notifications
        subscribedCustomers.notifyCustomers("New deal Available! Huge Discount on all electronics!");
        
        // Check if customers are subscribed
        System.out.println();
        System.out.println("Check subscribers:");
        subscribedCustomers.checkSubscriber(); 

        //Unsubscribe a customer
        subscribedCustomers.unsubscribe(customer3); //unsub jimin

    //sending notification after unsubscribing jimin and checking customers that are subscribed and not subscribed.
        // Trigger notifications again
        System.out.println();
        System.out.println("notify after removing Jimin");
        subscribedCustomers.notifyCustomers("New deal Available! Huge Discount on all electronics!");
        subscribedCustomers.checkSubscriber();        
    }
}