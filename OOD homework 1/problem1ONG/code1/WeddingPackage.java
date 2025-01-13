//using interfaces implement the wedding packages. 

//note: considering making the interface types as generics? 
//update: prof roy said it is ok to keep interfaces as is.
public abstract class WeddingPackage implements Venue, Catering, Decorations, Photography {
    private String venue;
    private String catering;
    private String decorations;
    private String photography;

//lainey advice on adding a constructor
    public WeddingPackage(String venue, String catering, String decorations, String photography) {
        this.venue = venue;
        this.catering = catering;
        this.decorations = decorations;
        this.photography = photography;
    }

//overriding the methods from the interfaces
    @Override
    public String getVenue() {
        return venue;
    }

    @Override
    public String getCatering() {
        return catering;
    }

    @Override
    public String getDecorations() {
        return decorations;
    }

    @Override
    public String getPhotography() {
        return photography;
    }
    
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public void setPhotography(String photography) {
        this.photography = photography;
    }
}