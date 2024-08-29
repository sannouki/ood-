package MenuProject;

public class Order {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount;

//getter and setters
    public MenuItem getItem1() {
        return this.item1;
    }

    public void setItem1(MenuItem item1) {
        this.item1 = item1;
    }

    public MenuItem getItem2() {
        return this.item2;
    }

    public void setItem2(MenuItem item2) {
        this.item2 = item2;
    }

    public MenuItem getItem3() {
        return this.item3;
    }

    public void setItem3(MenuItem item3) {
        this.item3 = item3;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
//display items for 3 items
    public void displayOrderDetails()
    {
        item1.displayItemInfo();
        item2.displayItemInfo();
        item3.displayItemInfo();
        System.out.println(calculateTotal());
    }
    public double calculateTotal()
    {
        totalAmount = item1.getPrice() + item2.getPrice() + item3.getPrice();
        return totalAmount;
    }

}