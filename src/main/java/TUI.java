import jdk.jshell.spi.ExecutionControl;
import java.util.Scanner;

public class TUI {
    Scanner sc = new Scanner(System.in);
    public short showMenu() {
        System.out.println("\n********************\n| TIC TAC TOE v0.1 |\n********************");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");

        return sc.nextShort();
    }

    public void showBoard(char[][] board, short playerTurn) {
        TUI.message("Starting a new game");
        //throw new ExecutionControl.NotImplementedException("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("It's player " + playerTurn + "'s turn.");
    }


    // Crea un array con dos posiciones [0] = Y, [1] = X que leera por el escaner y las devolvera, normalment este metodo es ejecutado por el metodo play() que usara esos dos aprametros para la jugada.
    // Falta añadirle un filtro para las casillas para que solo permita valores existentes del board
    public short[] pickMove()  {
        System.out.println("Y and X values: ");
        short[] pos = new short[2];

        pos[0] = sc.nextShort();
        pos[1] = sc.nextShort();
       return pos;
        // if(i < 0 || i >= 3 || j < 0 || j >= 3 || board[i][j] !='-'){
            //return false; // El movimiento que intenta el jugador es invalido
            //board[i][j] = 'X'; //La X marca el movimiento para el jugador actual

        //System.out.println("Ingresa la fila:");
        //posY = sc.nextInt();
        //System.out.println("Ingresa la columna");
        //posX = sc.nextInt();
    }

    public void endGame() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public static void message(String message) {
        System.out.println(message);
    }

}
