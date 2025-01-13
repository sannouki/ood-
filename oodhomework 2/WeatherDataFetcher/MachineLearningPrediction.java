package WeatherDataFetcher;
//overriding the abstract methods from the HurricanePredictionTemplate
//with the specific methods for the machine learning prediction.
public class MachineLearningPrediction extends HurricanePredictionTemplate {
    @Override
    protected void fetchData() {
        System.out.println("Fetching historical and real-time data for machine learning prediction...");
    }

    @Override
    protected void preprocessData() {
        System.out.println("Preprocessing historical and real-time data...");
    }

    @Override
    protected void applyPredictionModel() {
        System.out.println("Applying machine learning prediction model...");
    }

    @Override
    protected void postprocessResults() {
        System.out.println("Postprocessing and saving machine learning prediction results...");
    }
}