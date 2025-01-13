package WeatherDataFetcher;

//creating the structure of the prediction templates. 
//
public abstract class HurricanePredictionTemplate {
    public final void predictHurricane() {
        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();
    }
//the following methods are abstract and will be implemented in the subclasses.
    abstract void fetchData();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();
}