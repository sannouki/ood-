//this will create a wedding plan based on the key word that is entered. 
public class WeddingFactory {
    public static WeddingPackage createWeddingplan(String type) {
        if (type.equalsIgnoreCase("traditional")) {
            return new TraditionalWedding();
        } else if (type.equalsIgnoreCase("luxury")) {
            return new LuxuryWedding();
        } else if (type.equalsIgnoreCase("destination")) {
            return new DestinationWedding();
        } else {
            return new ErrorPackage(); //no package was selected
        }
    }
}