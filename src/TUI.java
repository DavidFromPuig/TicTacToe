import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;
import static java.lang.System.exit;

public class TUI {
    static Scanner sc = new Scanner(System.in);
    public static short showMenu() {
        System.out.println("\n********************\n| TIC TAC TOE v0.1 |\n********************");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");
        short menuChoice = 0;

        try {
            menuChoice = TUI.sc.nextShort();

            if (menuChoice == 1) {
                Main.newGame(menuChoice);
            } else if (menuChoice == 2) {
                Main.loadGame(menuChoice);
            } else if (menuChoice == 3) {
                Main.settings(menuChoice);
            } else if (menuChoice == 4) {
                exit(menuChoice);
            } else {
                badChoice(menuChoice);
            }

            return  menuChoice;

        } catch (Exception ex) {
            return badChoice(menuChoice); //opción invalida
        }
    }
    public static short badChoice(short menuChoice){
        System.out.println("That is not a valid choice *raises one eyebrow*");
        return showMenu();
    }
    public void showBoard() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public void pickMove() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public void endGame() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
