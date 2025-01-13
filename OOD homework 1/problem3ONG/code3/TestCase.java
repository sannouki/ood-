//import usage for a list
import java.util.List;

public class TestCase {
    public static void main(String[] args) {
        //create an instance of CSVDeviceAdapter
        CSVDeviceAdapter deviceAdapter = new CSVDeviceAdapter();
        //direct the path to read the file from using the method in device adapter
        deviceAdapter.readDevicesFromCSV("code3\\Sample.csv");
        //the list is to get each line of data from the file seperated by cammas
        List<Phone> phones = deviceAdapter.getPhones();
        List<Laptop> laptops = deviceAdapter.getLaptops();

        System.out.println("Devices:");
        //if there is no phones or laptops then print empty
        if (phones.isEmpty() && laptops.isEmpty()) {
            System.out.println("No devices found.");
        } else { //print out the phones
            for (int i = 0; i < phones.size(); i++) {
                System.out.println(phones.get(i));
            } //print out the laptops
            for (int i = 0; i < laptops.size(); i++) {
                System.out.println(laptops.get(i));
            }
        }
    }
}