import java.util.ArrayList;
import java.util.List;

class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void storeAndExecute(Command command) {
        commands.add(command);
        command.execute();
    }

}
