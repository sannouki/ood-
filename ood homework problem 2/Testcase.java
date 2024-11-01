public class Testcase {
    public static void main(String[] args) {
        ManufacturerA manufacturerA = new ManufacturerA();
        Drone surveillanceDrone = manufacturerA.createSurveillanceDrone();
        Drone deliveryDrone = manufacturerA.createDeliveryDrone();
        Drone agricultureDrone = manufacturerA.createDeliveryDrone();

        System.out.println("manufacturer A:");
        System.out.println("Testing Surveillance Drone:");
        surveillanceDrone.displayDroneDetails(surveillanceDrone);
        System.err.println("");
        System.out.println("Testing Surveillance Drone:");
        deliveryDrone.displayDroneDetails(deliveryDrone);
        System.out.println("");
        System.out.println("Testing Surveillance Drone:");
        agricultureDrone.displayDroneDetails(agricultureDrone);

        System.out.println("manufacturer B:");
        ManufacturerB manufacturerB = new ManufacturerB();
        Drone surveillanceDrone2 = manufacturerB.createSurveillanceDrone();
        Drone deliveryDrone2 = manufacturerB.createDeliveryDrone();
        Drone agricultureDrone2 = manufacturerB.createDeliveryDrone();

        System.out.println("Testing Surveillance Drone:");
        surveillanceDrone2.displayDroneDetails(surveillanceDrone2);
        System.err.println("");
        System.out.println("Testing Surveillance Drone:");
        deliveryDrone2.displayDroneDetails(deliveryDrone2);
        System.out.println("");
        System.out.println("Testing Surveillance Drone:");
        agricultureDrone2.displayDroneDetails(agricultureDrone2);

        //battery 500 delivery drone flightrange 5000 special feature: drop
        System.out.println("test");
        //creating the drone with custom parameters
        Drone professorRoysDeliveryDrone = manufacturerB.createDeliveryDrone(500, 5000, "drop");
        //printing the drone
        professorRoysDeliveryDrone.displayDroneDetails(professorRoysDeliveryDrone);
    }
}
