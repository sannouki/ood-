package WeatherDataFetcher;

public class Main {
    public static void main(String[] args) {
        //creates an instance of the StatisticalPrediction and MachineLearningPrediction
        HurricanePredictionTemplate statisticalPrediction = new StatisticalPrediction();
        HurricanePredictionTemplate machineLearningPrediction = new MachineLearningPrediction();

        PredictionInvoker invoker = new PredictionInvoker();

        // Using Statistical Prediction
        CommandInterface fetchStatisticalData = new FetchDataCommand(statisticalPrediction);
        CommandInterface applyStatisticalModel = new PredictionCommand(statisticalPrediction);
        CommandInterface saveStatisticalResults = new SaveResultsCommand(statisticalPrediction);

        invoker.addCommand(fetchStatisticalData); // 1st command added to the list
        invoker.addCommand(applyStatisticalModel); // 2nd added to the list
        invoker.addCommand(saveStatisticalResults); // 3rd added to the list
        System.out.println("Executing Statistical Prediction Workflow:");
        System.out.println("~~~~~~");
        invoker.executeCommands(); // Executes the commands in the list

        // Clear commands for next prediction
        invoker = new PredictionInvoker();

        // Using Machine Learning Prediction
        CommandInterface fetchMLData = new FetchDataCommand(machineLearningPrediction);
        CommandInterface applyMLModel = new PredictionCommand(machineLearningPrediction);
        CommandInterface saveMLResults = new SaveResultsCommand(machineLearningPrediction);

        invoker.addCommand(fetchMLData); // 1st command added to the list
        invoker.addCommand(applyMLModel); // 2nd added to the list
        invoker.addCommand(saveMLResults); // 3rd added to the list
        invoker.removeCommand(fetchMLData); // Removes the 1st command from the list
        
        System.out.println("\nExecuting Machine Learning Prediction Workflow:");
        System.out.println("~~~~~~");
        invoker.executeCommands(); // Executes all the commands in the list in order
}
}