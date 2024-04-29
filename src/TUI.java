import java.util.Scanner;

public class TUI {
    static Scanner sc = new Scanner(System.in);
    public static void showMenu() {

        System.out.println("\n********************\n| TIC TAC TOE v0.1 |\n********************");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");
        try {
            short menuChoice = TUI.sc.nextShort();

            if (menuChoice == 1) {
                Main.newGame(menuChoice);
            } else if (menuChoice == 2) {
                Main.continueM(menuChoice);
            } else if (menuChoice == 3) {
                Main.settings(menuChoice);
            } else if (menuChoice == 4) {
                Main.exit();
            } else {
                Main.badChoice();
            }
        } catch (Exception ex) {
            Main.badChoice();
        }

    }
}
