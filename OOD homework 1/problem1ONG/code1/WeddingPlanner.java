//this is paiges code 
public class WeddingPlanner {
    private static volatile WeddingPlanner instance = null; //ensure that the instance is always the same object

    //private constructor
    private WeddingPlanner() {

    }

    public static WeddingPlanner getInstance() {
        if(instance == null) {
            synchronized (WeddingPlanner.class) {
                if(instance == null) {
                    instance = new WeddingPlanner();
                }
            }
        }
        return instance;
    }

//planner returns the wedding package information
    public void planWedding(WeddingPackage weddingPackage) {
         System.out.println("Display wedding package information:");
         System.out.println("Venue: " + weddingPackage.getVenue());
         System.out.println("Catering: " + weddingPackage.getCatering());
         System.out.println("Decorations: " + weddingPackage.getDecorations());
         System.out.println("Photography: " + weddingPackage.getPhotography());
    }
}