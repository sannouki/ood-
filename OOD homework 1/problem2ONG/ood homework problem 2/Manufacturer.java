//manufacturer interface allow different manufactururs to create different drones


public interface Manufacturer {

    SurveillanceDrone createSurveillanceDrone();
    DeliveryDrone createDeliveryDrone();
    AgricultureDrone createAgricultureDrone();
    
} 