//inherit the ability to make drones from manufacturer 
public class ManufacturerA implements Manufacturer{
    //Manufacturer A focuses on creating drones with longer battery life
    
    //blueprint to make drones surveillance, delivery, and agriculturals
    //allow manufacturer to customize drones details such as the range the battery and features.
    @Override
    public SurveillanceDrone createSurveillanceDrone() {
        return new SurveillanceDrone(1000, 100, "Camera with night vision");
    }

    @Override
    public DeliveryDrone createDeliveryDrone() {
        return new DeliveryDrone(1000, 150, "carrying packages and delivering");
    }

    @Override
    public AgricultureDrone createAgricultureDrone() {
        return new AgricultureDrone(1000, 100,"planting and cropping");
    }

}

