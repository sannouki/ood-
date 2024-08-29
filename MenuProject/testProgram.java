package MenuProject;

public class testProgram {
    public static void main(String[] args) {
        MenuItem bread = new MenuItem("bread", 4.99, "Carbs");
        MenuItem Chocolate = new MenuItem("chocolate bar", 1.99, "candy");
        MenuItem Juice = new MenuItem("Apple juice", 3.25, "drink");
        Cafe menulist = new Cafe();
        menulist.addMenuItem1(bread);
        menulist.addMenuItem2(Juice);
        menulist.addMenuItem3(Chocolate);
        Order orderedList = new Order();
        orderedList.setItem1(bread);
        orderedList.setItem3(Juice);
        orderedList.setItem2(Chocolate);
        orderedList.displayOrderDetails();
    }
}
