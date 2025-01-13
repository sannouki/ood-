package WeatherDataFetcher;
//the concrete class that implements the postprocessResults method 
//from the HurricanePredictionTemplate
public class SaveResultsCommand implements CommandInterface {
    private HurricanePredictionTemplate prediction;

    public SaveResultsCommand(HurricanePredictionTemplate prediction) {
        this.prediction = prediction;
    }

    @Override
    public void execute() {
        prediction.postprocessResults();
    }
}