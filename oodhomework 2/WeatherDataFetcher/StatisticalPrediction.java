package WeatherDataFetcher;
//overriding the abstract methods from the HurricanePredictionTemplate
//with the specific methods for the statistical prediction.
public class StatisticalPrediction extends HurricanePredictionTemplate {
    @Override
    protected void fetchData() {
        System.out.println("Fetching data for statistical prediction...");
    }

    @Override
    protected void preprocessData() {
        System.out.println("Preprocessing statistical data...");
    }

    @Override
        protected void applyPredictionModel() {
            System.out.println("Applying statistical prediction model...");
        }

    @Override
    protected void postprocessResults() {
        System.out.println("Postprocessing and saving statistical prediction results...");
    }
}