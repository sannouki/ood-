package MenuProject;

public class MenuItem {
    private String name;
    private double price;
    private String category;

//Constructor
    public MenuItem(String name, double price, String category)
    {
     this.name = name;
     this.price = price;
     this.category = category;   
    }

//getter and setter for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
//getter and setter for price
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//getter and setter for category
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//display item info method

public void displayItemInfo()
{
    System.out.println("this is the category: " + this.category);
    System.out.println("the price: " + this.price);
    System.out.println("item name: " + this.name);
}


}