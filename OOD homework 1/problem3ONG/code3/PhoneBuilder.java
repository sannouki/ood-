public class PhoneBuilder {
    private String productName;
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;
    private double price;

    public PhoneBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public PhoneBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public PhoneBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public PhoneBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public PhoneBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getPrice() {
        return price;
    }
//method to create a phone
    public Phone build() {
        return new Phone(productName, processor, ram, storage, graphicsCard, operatingSystem, price);
    }
}