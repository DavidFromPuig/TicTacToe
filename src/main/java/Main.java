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
    //Crea un nuevo juego, muestra el tablero a partir de lo anterior y recoge la jugada asi cambiando el tablero hasta que detecta una jugada ganadora o un empate.
    private static void newGameOption(Game game, TUI tui)  {
        game.newGame();
        tui.showBoard(game.getBoard());
        while (game.winnerMove() == false) {
            game.play(tui.pickMove(game.isPlayerTurn()));
            tui.showBoard(game.getBoard());
        }
    }
    public static void loadGame(Game game, TUI tui){
        //System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
    }
    public static void settings(Game game, TUI tui){
        //System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
    }
    //Avisa de que estas saliendo del programa
    public static void exit(TUI tui){
        tui.message("You are exiting the program.");

    }
    public static void badChoice(){
        //System.out.println("That is not a valid choice *raises one eyebrow*");
    }
}