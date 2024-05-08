import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        TUI tui = new TUI();
        Game game = new Game();

        menu:
        while (true) {
            short option = tui.showMenu();

            switch (option) {
                case 1:
                    newGameOption(game, tui);
                    break;

                case 2:
                    loadGame(game, tui);
                    break;

                case 3:
                    settings(game, tui);
                    break;

                case 4:
                    exit(tui);
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
    public static void loadGame(Game game, TUI tui){
        //System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
    }
    public static void settings(Game game, TUI tui){
        //System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
    }
    public static void exit(TUI tui){
        //System.out.println("Noooo :( why would you do that?! Exiting...");
        tui.message("You are exiting the program.");

    }
    public static void badChoice(){
        //System.out.println("That is not a valid choice *raises one eyebrow*");
    }
}