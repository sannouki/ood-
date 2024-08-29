package MenuProject;

public class Cafe {
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private MenuItem menuItem3;
    private Order currentOrder;
//getters and setters for the 3 menuitems
    public MenuItem getMenuItem1() {
        return this.menuItem1;
    }

    public void setMenuItem1(MenuItem menuItem1) {
        this.menuItem1 = menuItem1;
    }

    public MenuItem getMenuitem2() {
        return this.menuItem2;
    }

    public void setMenuitem2(MenuItem menuitem2) {
        this.menuItem2 = menuitem2;
    }

    public MenuItem getMenuitem3() {
        return this.menuItem3;
    }

    public void setMenuitem3(MenuItem menuitem3) {
        this.menuItem3 = menuitem3;
    }

    public Order getCurrentOrder() {
        return this.currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    public void addMenuItem1(MenuItem item)
    {
        this.menuItem1 = item;
    }
    public void addMenuItem2(MenuItem item)
    {
        this.menuItem2 = item;
    }
    public void addMenuItem3(MenuItem item)
    {
        this.menuItem3 = item;
    }
//calculate total for the items order.
    public Order placeOrder(Order order)
    {
        currentOrder = order;
        currentOrder.calculateTotal();
        return currentOrder;
    }
    public void displayMenu()
    {
        menuItem1.displayItemInfo();
        menuItem2.displayItemInfo();
        menuItem3.displayItemInfo();
    }
    
}
