package Utils;

import game.NPlayer;

public class Commands {
    private static Command CREATE;

    static {
        CREATE = (args, sender) -> {
            switch (args[0].toLowerCase()) {
                case "map":
                    
                    break;
                default:
                    sender.sendMessage("&cNothing selected");
                    break;
            }
            return true;
        };
    }

}
interface Command {
    boolean execute(String[] args, NPlayer sender);
}
