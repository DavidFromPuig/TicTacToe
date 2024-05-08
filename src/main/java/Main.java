import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        TUI tui = new TUI();
        Game game = new Game();

        menu:
        while (true) {
            short opt = tui.showMenu();

            switch (opt) {
                case 1:
                    newGameOption(game, tui);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break menu;
            }
        }


    }
    public static void newGameOption(Game game, TUI tui)  {
        //System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
        game.newGame();
        tui.showBoard(game.getBoard(), game.isPlayerTurn());
        //recollir jugada (bucle a dins)

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