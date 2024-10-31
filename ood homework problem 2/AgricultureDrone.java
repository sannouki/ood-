public class AgricultureDrone implements Drone{
    int battery;
    double flightRange;
    String specialFeature;

    //constructor for drone
    public AgricultureDrone (int battery, double flightRange, String specialFeature) {
        this.battery = battery;
        this.flightRange = flightRange;
        this.specialFeature = specialFeature;
    }

    //inherit methods from parent so when factory creates drone, it can call and overrides
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

    @Override
    public void displayDroneDetails(Drone drone) {
        System.out.println("Drone Details: Battery Life = " + drone.battery() + 
                           ", Range = " + drone.FlightRange() + 
                           ", Feature = " + drone.SpecialFeature());
    }
}