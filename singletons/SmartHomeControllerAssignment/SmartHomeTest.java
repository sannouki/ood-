package SmartHomeControllerAssignment;

public class SmartHomeTest {
    public static void main(String[] args) {
        SmartHomeControllerSingleton controller1 = SmartHomeControllerSingleton.getInstance();
        SmartHomeControllerSingleton controller2 = SmartHomeControllerSingleton.getInstance();
        
//controller 1  
        controller1.turnOnLights();
        controller1.turnOffLights();
        
        controller1.armSecurity();
        controller1.disarmSecurity();

        controller1.setTemperature(25);
//controller 2
        System.out.println("");
        controller2.turnOnLights();
        controller2.turnOffLights();
        
        controller2.armSecurity();
        controller2.disarmSecurity();

        controller2.setTemperature(44);
    }

}
