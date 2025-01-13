//basically the client orders.
//testing the wedding packages that were ordered

public class TestCase {
    public static void main(String[] args) {
        // Create a TraditionalWedding package using the factory
        WeddingPackage traditionalWedding1 = WeddingFactory.createWeddingplan("traditional");
        WeddingPlanner traditionalplanner = WeddingPlanner.getInstance();
        traditionalplanner.planWedding(traditionalWedding1);
    System.out.println("");
    System.out.println("updated traditional wedding details:");
    System.out.println("");
        // Use the builder to override the venue to China
        WeddingPackage traditionalCustomizer = new WeddingPackageBuilder()
                .setVenue("China")
                .createCustomWedding(traditionalWedding1); // using the builder to customize the wedding package
                traditionalplanner.planWedding(traditionalCustomizer);
        //create a luxury wedding (default package)
        System.out.println("~~~~~~");
        WeddingPackage luxuryWedding1 = WeddingFactory.createWeddingplan("luxury");
        WeddingPlanner luxuryplanner = WeddingPlanner.getInstance(); //Getting access to the singleton instance.
        luxuryplanner.planWedding(luxuryWedding1);
    System.out.println("");
    System.out.println("updated luxury wedding details:");
        WeddingPackage LuxuryCustomizer = new WeddingPackageBuilder()
            .setVenue("mexico")
            .setCatering("yo mama")
            .setDecorations("poppy flowers") 
            .createCustomWedding(traditionalWedding1); // using the builder to customize the wedding package
            traditionalplanner.planWedding(LuxuryCustomizer);
    System.out.println("");
    System.out.println("test for no chosen package");
        WeddingPackage noWedding = WeddingFactory.createWeddingplan("asd");
        //WeddingPlanner traditionalplanner = WeddingPlanner.getInstance();
        traditionalplanner.planWedding(noWedding);






            }
        }













//this was previous testing method with hard code printlines ignore now that everything works.
        // Print the default details of the traditionalWedding1 object
        /*
         * System.out.println("Default Traditional Wedding Details:");
         * System.out.println("Venue: " + traditionalWedding1.getVenue());
         * System.out.println("Catering: " + traditionalWedding1.getCatering());
         * System.out.println("Decorations: " + traditionalWedding1.getDecorations());
         * System.out.println("Photography: " + traditionalWedding1.getPhotography());
         * 
         * 
         * 
         * // Print the updated details of the traditionalWedding1 object
         * System.out.println("\nUpdated Traditional Wedding Details:");
         * System.out.println("Venue: " + customizedWedding.getVenue());
         * System.out.println("Catering: " + customizedWedding.getCatering());
         * System.out.println("Decorations: " + customizedWedding.getDecorations());
         * System.out.println("Photography: " + customizedWedding.getPhotography());
         * System.out.println("");
         * 
         * WeddingPackage DestinationWedding1 =
         * WeddingFactory.createWeddingplan("destination");
         * System.out.println("Default Destination Wedding Details:");
         * System.out.println("Venue: " + DestinationWedding1.getVenue());
         * System.out.println("Catering: " + DestinationWedding1.getCatering());
         * System.out.println("Decorations: " + DestinationWedding1.getDecorations());
         * System.out.println("Photography: " + DestinationWedding1.getPhotography());
         * //System.out.println(DestinationWedding1.traveling());
         */
