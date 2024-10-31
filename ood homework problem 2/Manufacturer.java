//manufacturer interface allow different manufactururs to create different drones


public interface Manufacturer {

    SurveillanceDrone createSurveillanceDrone();
    DeliveryDrone createDeliveryDrone();
    AgricultureDrone createAgricultureDrone();
    //AgricultureDrone2 createAgricultureDrone(int battery, double flightRange, String specialFeature);
} 