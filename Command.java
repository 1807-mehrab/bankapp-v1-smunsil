public class Command {
    private String commandWord;
    private Double amount;

    public Command(String firstWord, Double amount) {
        commandWord = firstWord;
        this.amount = amount;
    }

    public String getCommandWord() {
        return commandWord;
    }

    public String getAmount() {
        return amount.toString();
    }

    public boolean isUnknown() {
        return (commandWord == null);
    }

    public boolean hasAmount() {
        return (amount != null);
    }
    
    /*private String word;
    private Double amount;

    public void CommandWord(String word, Double amount) {
        this.word = word;
        this.amount = amount;
    }

    public String getWord() {
        return word;
    }

    public String getAmount() {
        return amount;
    }

    public boolean isUnknown() {
        return (word == null);
    }

    public boolean hasamount() {
        return (amount != null);
    }*/
}