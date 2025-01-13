package SmartHomeControllerAssignment;

public class SmartHomeControllerSingleton {
    public static SmartHomeControllerSingleton instance = null;

    private boolean lightsOn;
    private int currentTemperature;
    private boolean securitySystem;

    //private constructor for singleton
    private SmartHomeControllerSingleton()
    {
        //default values 
        lightsOn = false;
        currentTemperature = 22;
        securitySystem = false; //true = security is on
    }

 //control the lights
    public void turnOnLights()
    {
        lightsOn = true;
        System.out.println("the lights is on: " + lightsOn);
    }
    public void turnOffLights()
    {
        lightsOn = false;
        System.out.println("the lights is off: " + lightsOn);
    }

//arming the security system
    public void armSecurity(){
        securitySystem = true;
        System.out.println("the security is armed");
    }
    public void disarmSecurity(){
        securitySystem = false;
        System.out.println("the security is disarmed");
    }
//controlling the thermostat 
public void setTemperature(int Temperature){
    currentTemperature = Temperature;
    System.out.println("the temperature is set to: " + currentTemperature);
}

    public static SmartHomeControllerSingleton getInstance() {
        if ( instance == null ){
            synchronized (SmartHomeControllerSingleton.class){
                if( instance == null ){
                    instance = new SmartHomeControllerSingleton();
                }
            }
        }
        return instance;
    }

}
