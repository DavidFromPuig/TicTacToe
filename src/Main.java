import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("####################\n# TIC TAC TOE v0.1 #\n####################");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");
        short menuChoice = sc.nextShort();
    }
}