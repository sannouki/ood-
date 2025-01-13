//the builder class will allow customization to the selected packages

public class WeddingPackageBuilder {
    private String venue;
    private String catering;
    private String decorations;
    private String photography;

    public WeddingPackageBuilder setVenue(String venue) {
        this.venue = venue;
        return this; //this will return the builder the keyword was fixed by copilot
    }
    public String getVenue() {
        return venue;
    }

    public WeddingPackageBuilder setCatering(String catering) {
        this.catering = catering;
        return this;
    }
public String getCatering() {
        return catering;
    }

    public WeddingPackageBuilder setDecorations(String decorations) {
        this.decorations = decorations;
        return this;
    }
public String getDecorations() {
        return decorations;
    }

    public WeddingPackageBuilder setPhotography(String photography) {
        this.photography = photography;
        return this;
    }
public String getPhotography() {
        return photography;
    }

    //this method will override the default package with the custom package
    public WeddingPackage createCustomWedding(WeddingPackage Package) { 
    //this method takes in the existing package and allow custo changes
        if (venue != null) {
            Package.setVenue(venue);
        }
        if (catering != null) {
            Package.setCatering(catering);
        }
        if (decorations != null) {
            Package.setDecorations(decorations);
        }
        if (photography != null) {
            Package.setPhotography(photography);
        }
        return Package;
    }
}