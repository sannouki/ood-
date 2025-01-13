package ChocolateFactoryAssignment;

public class ChocolateTest {
    public static void main(String[] args) {
    //this machine1 will handle the first batch that will cook perfectly.
        ChocolateFactorySingleton machine1 = ChocolateFactorySingleton.getInstance();

        machine1.displayStatus(); //at the start, there should nothing be in the boiler

        machine1.boil();
        machine1.fill();
        machine1.boil();

        machine1.displayStatus();
        machine1.drain();
        machine1.displayStatus(); //after cooking

        System.out.println("");

        ChocolateFactorySingleton machine2 = ChocolateFactorySingleton.getInstance();

        machine2.displayStatus(); //at the start, there should nothing be in the boiler

        machine2.boil();
        machine2.drain();
        machine2.fill();
        machine2.drain(); //cant drain because the mixture is not cooked

        
        machine2.displayStatus(); //display result after cooking
    }
}
