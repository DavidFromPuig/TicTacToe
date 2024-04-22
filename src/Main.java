import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        mainMenu();
    }
    private static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n####################\n# TIC TAC TOE v0.1 #\n####################");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");
        short  menuChoice = sc.nextShort();

        if (menuChoice == 1) {
            newGame(menuChoice);
        } else if (menuChoice == 2) {
            continueM(menuChoice);
        } else if (menuChoice == 3) {
            settings(menuChoice);
        } else if (menuChoice == 4) {
            exit();
        } else {
            badChoice(menuChoice);
        }
    }
    private static void newGame(short menuChoice){
        System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
        mainMenu();
    }
    private static void continueM(short menuChoice){
        System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
        mainMenu();
    }
    private static void settings(short menuChoice){
        System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
        mainMenu();
    }
    private static void exit(){
        System.out.println("Noooo :( why would you do that?! Exiting...");
        mainMenu();
    }
    private static void badChoice(short menuChoice){
        System.out.println("That is not a valid choice *raises one eyebrow* (" + menuChoice + ")");
        mainMenu();
    }
}