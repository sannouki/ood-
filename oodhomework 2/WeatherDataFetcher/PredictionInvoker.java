package WeatherDataFetcher;

import java.util.ArrayList;
import java.util.List;
//execute each commands in order.
public class PredictionInvoker {
    private List<CommandInterface> commands = new ArrayList<>();
/*adds commands to the list of commands to execute.
 * 
 * 
 */
    public void addCommand(CommandInterface command) {
        commands.add(command);
    }

    public void removeCommand(CommandInterface command) {
        commands.remove(command);
    }

    public void executeCommands() {
        for (CommandInterface command : commands) {
            command.execute();
        }
    }
}