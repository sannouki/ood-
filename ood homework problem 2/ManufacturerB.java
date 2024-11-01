public class ManufacturerB implements Manufacturer {
    // Manufacturer B focuses on creating drones with accurate flightrange for the
    // job

    // blueprint to make drones surveillance, delivery, and agriculturals
    // allow manufacturer to customize drones details such as the range the battery
    // and features.
    @Override
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(500, 150.50, "Camera with night vision");
    }

    @Override
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(500, 125.8, "carrying packages and delivering");
    }

    // @Override
    // public AgricultureDrone createAgricultureDrone() {
    // return new AgricultureDrone(150, 500, "planting and cropping");

    @Override
    public AgricultureDrone createAgricultureDrone() {
        return new AgricultureDrone(15, 5, "planting and cropping");
    }

    // Overloaded method change drones custom details
    public AgricultureDrone createAgricultureDrone(int battery, double flightRange, String specialFeature) {
        return new AgricultureDrone(battery, flightRange, specialFeature);
    }

    public DeliveryDrone createDeliveryDrone(int battery, double flightRange, String specialFeature) {
        return new DeliveryDrone(battery, flightRange, specialFeature);
    }

    // Overloaded method to create an agriculture drone with custom parameters
    public SurveillanceDrone createSurveillanceDrone(int battery, double flightRange, String specialFeature) {
        return new SurveillanceDrone(battery, flightRange, specialFeature);
    }
}

