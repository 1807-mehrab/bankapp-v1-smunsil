public class Main {
    private Parser parser;
    //private Room currentRoom;

    public static void main(String[] args) {
        Main game = new Main();
        game.play();
    }

    public Main() {
        //createRooms();
        parser = new Parser();
    }

    /*private void createRooms() {
        Room outside, hallway, classroom;

        outside = new Room("Outside the Science Hall. It's hot.");
        hallway = new Room("In the hallway. It's still hot.");
        classroom = new Room("In class. You are eaten by a grue.");

        outside.setExit("hallway", hallway);
        hallway.setExit("outside", outside);
        hallway.setExit("classroom", classroom);

        currentRoom = outside;
    }*/

    public void play() {
        System.out.println();
        System.out.println("Welcome to Munsil bank");
        System.out.println("A mysterious bank.");
        System.out.println("The only winning move is not to deposit money.");
        System.out.println("Type 'help' if you need it.");

        //System.out.println(currentRoom.getLongDescription());

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thanks for banking.");
    }

    private boolean processCommand(Command command) {
        boolean wantToQuit = false;
        if(command.isUnknown()) {
            System.out.println("I don't understand.");
            return false;
        }

        String commandWord = command.getCommandWord();
        //if (commandWord.equals("go")) {
            //goRoom(command);
    /*} else*/ if (commandWord.equals("help")) {
            System.out.println("You are lost.");
            System.out.println("You ask for help.");
            System.out.println("A man frm behind the desk speaks out: ");
            System.out.println();
            parser.showCommands();
        } else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }

        return wantToQuit;
    }

    /*private void goRoom(Command command) {
        if (!command.hasSecondWord()) {
            //If there is no second word
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        //Try to leave current room
        Room nextRoom = currentRoom.getExit(direction);

        if(nextRoom == null) {
            System.out.println("Can't go there.");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
    }*/

    private boolean quit(Command command) {
        if(command.hasAmount()) {
            System.out.println("Quit what?");
            return false;
        } else {
            return true;
        }
    }

}
