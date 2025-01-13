package ChocolateFactoryAssignment;

//import SmartHomeControllerAssignment.SmartHomeControllerSingleton;

public class ChocolateFactorySingleton {
    public static ChocolateFactorySingleton instance = null;

    //variables
    private boolean isempty; //for fill or drain
    private boolean cooked;

    //constructor
    private ChocolateFactorySingleton()
    {
        //default values 
        isempty = false;
        cooked = false;
    }

public void fill(){ //this will fill the boiler 
if(isempty == false){
    isempty = true;
    System.out.println("filling up the empty boiler with chocolate mixture");
}
else {
    System.out.println("Boiler is already full");
     }
}

public void drain(){
    if(cooked == true)
    {
    isempty = false;
    cooked = false; //i think this is logical because once i drain the cooked mixture we should turn it off?
    System.out.println("draining the boiler: " + isempty);
    }
    else {
        System.out.println("nothing to drain.");
    }
}

public void boil()
{   
    if(isempty == true)
    {
    cooked = true;
    System.out.println("the mixture is currently being boiled: " + cooked);
    }
    else{
        System.out.println("not ready to be boiled");
    }
}

public void displayStatus()
{
    System.out.println("~~~status of boiler:~~~");
    System.out.println("the boiler is full: " + isempty);
    System.out.println("is the mixture boiling: " + cooked);
    System.out.println("~~~end of status:~~~");
}

public static ChocolateFactorySingleton getInstance() {
        if ( instance == null ){
            synchronized (ChocolateFactorySingleton.class){
                if( instance == null ){
                    instance = new ChocolateFactorySingleton();
                }
            }
        }
        return instance;
    }

}
