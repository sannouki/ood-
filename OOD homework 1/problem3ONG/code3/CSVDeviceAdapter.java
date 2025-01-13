import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVDeviceAdapter {
    //List to store phone and laptop objects
    private List<Phone> phones;
    private List<Laptop> laptops;

    //Constructor to initiate the lists
    public CSVDeviceAdapter() {
        this.phones = new ArrayList<>();
        this.laptops = new ArrayList<>();
    }
    //Read file
    public void readDevicesFromCSV(String csvFile) {
        try {
            List<String[]> data = CSVReader.readCSV(csvFile);
            for (int i = 0; i < data.size(); i++) {
                String[] rowData = data.get(i);
                if (rowData.length == 7) {
                    if (isPhone(rowData)) {
                        phones.add(new Phone(
                            rowData[0], // productName
                            rowData[1], // processor
                            rowData[2], // ram
                            rowData[3], // storage
                            rowData[4], // gpu
                            rowData[5], // OS
                            Double.parseDouble(rowData[6]) // price
                        ));
                    } else if (isLaptop(rowData)) {
                        laptops.add(new Laptop(
                            rowData[0], // productName
                            rowData[1], // processor
                            rowData[2], // ram
                            rowData[3], // storage
                            rowData[4], // gpu
                            rowData[5], // OS
                            Double.parseDouble(rowData[6]) // price
                        ));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//checks if its a phone
    private boolean isPhone(String[] rowData) {
        return "N/A".equalsIgnoreCase(rowData[4]) || rowData[4].isEmpty();
    }
//check if the item is a laptop
    private boolean isLaptop(String[] rowData) {
        return !isPhone(rowData);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }
}