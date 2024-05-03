public class Main {
    public static void main(String[] args) {

        TUI tui = new TUI();
        short menuChoice = tui.showMenu();
        Game game = new Game();
        if (menuChoice == 1) {
            newGame();
        } else if (menuChoice == 2) {
            loadGame();
        } else if (menuChoice == 3) {
            settings();
        } else if (menuChoice == 4) {
            exit();
        }

    }
    public static void newGame(short menuChoice, TUI tui){
        System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
        tui.showMenu();
    }
    public static void loadGame(short menuChoice, TUI tui){
        System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
        tui.showMenu();
    }
    public static void settings(short menuChoice, TUI tui){
        System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
        tui.showMenu();
    }
    public static void exit(TUI tui){
        System.out.println("Noooo :( why would you do that?! Exiting...");
        tui.showMenu();
    }

}