import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TUI tui = new TUI();
        TUI.mainMenu();
        Game game = new Game();

    }
    public static void newGame(short menuChoice){
        System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
        TUI.mainMenu();
    }
    public static void continueM(short menuChoice){
        System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
        TUI.mainMenu();
    }
    public static void settings(short menuChoice){
        System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
        TUI.mainMenu();
    }
    public static void exit(){
        System.out.println("Noooo :( why would you do that?! Exiting...");
        TUI.mainMenu();
    }
    public static void badChoice(){
        System.out.println("That is not a valid choice *raises one eyebrow*");
        TUI.mainMenu();
    }
}