public class DeliveryDrone implements Drone{
    int battery;
    double flightRange;
    String specialFeature;

    //constructor for drone
    public DeliveryDrone (int battery, double flightRange, String specialFeature) {
        this.battery = battery;
        this.flightRange = flightRange;
        this.specialFeature = specialFeature;
    }
    @Override
    public int battery() {
        return battery;
    }

    @Override
    public double FlightRange() {
        return flightRange;
    }

    @Override
    public String SpecialFeature() {
        return specialFeature;
    }

    // Setter methods to update the properties
    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    @Override
    public void displayDroneDetails(Drone drone) {
        System.out.println("Drone Details: Battery Life = " + battery() + 
                           ", Range = " + FlightRange() + 
                           ", Feature = " + SpecialFeature());
    }
}