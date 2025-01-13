package WeatherDataFetcher;

public class PredictionCommand implements CommandInterface {
    private HurricanePredictionTemplate prediction;

    public PredictionCommand(HurricanePredictionTemplate prediction) {
        this.prediction = prediction;
    }

    @Override
    public void execute() {
        prediction.applyPredictionModel();
    }
}