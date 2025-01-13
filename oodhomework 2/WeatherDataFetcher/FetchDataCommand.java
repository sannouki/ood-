package WeatherDataFetcher;
//the concrete class that implements the fetchData method from the HurricanePredictionTemplate
public class FetchDataCommand implements CommandInterface {
    private HurricanePredictionTemplate prediction;
     
    public FetchDataCommand(HurricanePredictionTemplate prediction) {
        this.prediction = prediction;
    }
//when executed, 
    @Override
    public void execute() {
        prediction.fetchData();
    }
}