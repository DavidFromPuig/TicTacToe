import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("####################\n# TIC TAC TOE v0.1 #\n####################");
            System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
            System.out.print("Your choice (1-4): ");
            short  menuChoice = sc.nextShort();

            if (menuChoice == 1) {
                System.out.println("The option you have chosen is to create a new game! (" + menuChoice + ")");
            } else if (menuChoice == 2) {
                System.out.println("The option you have chosen is to continue a game. (" + menuChoice + ")");
            } else if (menuChoice == 3) {
                System.out.println("You have chosen to adjust the game. (" + menuChoice + ")");
            } else if (menuChoice == 4) {
                System.out.println("Noooo :( why would you do that?! Exiting...");
            } else {
                System.out.println("That is not a valid choice *raises one eyebrow*");
            }

        }
    }
}