public class CommandWords {
    private static final String[] validCommands = {
        "add", "withdraw", "balance", "help"
    };

    public CommandWords() {}

    public boolean isCommand(String input) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(input)) {
                return true;
            }
        }
        //if we get here string was not found in commands
        return false;
    }

    public void showAll() {
        for (String command : validCommands) {
            System.out.print(command + " ");
        }
        System.out.println();
    }
    
    /*private static String[] bankCommands = {"add", "withdraw", "check", "exit"};

    public boolean isCommand(String input) {
        for (int i = 0; i < bankCommands.length; i++) {
            if (bankCommands[i].equals(input)) {
                return true;
            }
        }
        return false;
    }

    public void showCommands() {
        for (String command : bankCommands) {
            System.out.print(command + " ");
        }
        System.out.println();
    }*/
}