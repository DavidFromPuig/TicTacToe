import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

public class TUI {
    static Scanner sc = new Scanner(System.in);
    public short showMenu() {
        System.out.println("\n********************\n| TIC TAC TOE v0.1 |\n********************");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");

        return sc.nextShort();
    }
    public short badChoice(short menuChoice){
        System.out.println("That is not a valid choice *raises one eyebrow*");
        return showMenu();
    }

    public void showBoard(char[][] board, boolean playerTurn) {
        //throw new ExecutionControl.NotImplementedException("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public void pickMove() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public void endGame() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
