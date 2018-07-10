import java.util.Scanner;

public class Parser {
    private CommandWords commands;
    private Scanner reader;

    public Parser() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        String inputLine;
        String word1 = null;
        Double amount = null;

        System.out.print("> ");
        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if (tokenizer.hasNext()) {
            word1 = tokenizer.next();
            if (tokenizer.hasNext()) {
                Double.parseDouble(amount) = tokenizer.next();
                //got stuck here trying to convert the next scanner item to a double
            }
        }

        //Check if words are known
        if (commands.isCommand(word1)) {
            return new Command(word1, amount);
        } else {
            return new Command(null, amount);
        }
    }

    public void showCommands() {
        commands.showAll();
    }

    /*private Command command;
    private Scanner reader;

    public Parser() {
        command = new CommandWord();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        String input;
        String word = null;
        Double amount = null;

        System.out.println("-> ");
        input = reader.nextLine();

        Scanner tokenizer = new Scanner(input);
        if (tokenizer.hasNext()) {
            word = tokenizer.hasNext();
        } if (tokenizer.hasNext()) {
            amount = tokenizer.hasNext();
        }

        if (command.isCommand(word)) {
            return new Command(word, amount);
        } else {
            return new Command (null, amount);
        }
    }
    public void showCommands() {
        command.showCommands();
    }*/

}