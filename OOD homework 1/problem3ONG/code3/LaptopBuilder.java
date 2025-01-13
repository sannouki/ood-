public class LaptopBuilder {
    private String processor;
    private String ramSize;
    private String storageSize;
    private String graphicsCard;
    private String operatingSystem;
    private double price;
//constructor
    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public LaptopBuilder setRamSize(String ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public String getRamSize() {
        return ramSize;
    }

    public LaptopBuilder setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    public String getStorageSize() {
        return storageSize;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public LaptopBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getPrice() {
        return price;
    }
//method need to build a laptop
    public Laptop build() {
        return new Laptop(processor, ramSize, storageSize, graphicsCard, operatingSystem, graphicsCard, price);
    }
}