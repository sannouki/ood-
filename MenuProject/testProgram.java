package MenuProject;

public class testProgram {
    public static void main(String[] args) {
        //initiating the menu items
        MenuItem bread = new MenuItem("bread", 4.99, "Carbs");
        MenuItem Chocolate = new MenuItem("chocolate bar", 1.99, "candy");
        MenuItem Juice = new MenuItem("Apple juice", 3.25, "drink");
        //initiating a cafe object
        Cafe menulist = new Cafe();
        //adding each menuitem to the cafe object
        menulist.addMenuItem1(bread);
        menulist.addMenuItem2(Juice);
        menulist.addMenuItem3(Chocolate);
        //creating a Order list
        Order orderedList = new Order();
        //adding each menu item to the order
        orderedList.setItem1(bread);
        orderedList.setItem3(Juice);
        orderedList.setItem2(Chocolate);
        //display the information of the items that is part of your order as well as the total price
        orderedList.displayOrderDetails();
    }
}
