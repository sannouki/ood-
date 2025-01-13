public class Phone {
    private String productName;
    private String processor;
    private String ramSize;
    private String storageSize;
    private String graphicsCard;
    private String operatingSystem;
    private double price;

    // Constructor
    public Phone(String productName, String processor, String ramSize, String storageSize, String graphicsCard, String operatingSystem, double price) {
        this.productName = productName;
        this.processor = processor;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.graphicsCard = graphicsCard;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    // Getters and Setters to get and set the properties of the phone
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return productName + " [Processor: " + processor + ", RAM: " + ramSize + ", Storage: " + storageSize + ", GPU: " + graphicsCard + ", OS: " + operatingSystem + ", Price: " + price + "]";
    }
}