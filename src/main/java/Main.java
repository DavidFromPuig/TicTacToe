import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        TUI tui = new TUI();
        TUI.showMenu();
        Game game = new Game();
    }
    public static void newGameOption(short menuChoice) throws ExecutionControl.NotImplementedException {
        System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
        Game game = new Game();
        TUI tui = new TUI();
        game.newGame();
        tui.showBoard(game.getBoard(), game.isPlayerTurn());
        //game.showBoard();
        //TUI.showMenu();
    }
    public static void loadGame(short menuChoice){
        System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
        TUI.showMenu();
    }
    public static void settings(short menuChoice){
        System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
        TUI.showMenu();
    }
    public static void exit(short menuChoice){
        System.out.println("Noooo :( why would you do that?! Exiting...");
        TUI.showMenu();
    }
    public static void badChoice(short menuChoise){
        System.out.println("That is not a valid choice *raises one eyebrow*");
        TUI.showMenu();
    }
}