import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class TUI {
    Scanner sc = new Scanner(System.in);
    File dir = new File("newDir");
    File file = new File("newDir/config.txt");
    File fileAlone = new File("config.txt");

    //Muestra el menu con sus opciones y devuelve el valor de la opción escogida
    public short showMenu() {
        System.out.println("\n********************\n| TIC TAC TOE v0.1 |\n********************");
        System.out.println("Welcome to the Tic Tac Toe menu!\nWhat do you want to do?\n- 1 New game\n- 2 Continue\n- 3 Settings\n- 4 Quit");
        System.out.print("Your choice (1-4): ");

        return sc.nextShort();
    }
    //En caso de escribir cualquier cosa que no se ajuste a las opciones este metodo sirve para controlar el error
    public short badChoice(short menuChoice){
        System.out.println("That is not a valid choice *raises one eyebrow*");
        return showMenu();
    }
    //Con dos bucles recorre el tablero entero mostrandolo y añade una barra caundo es necesario apra mejorar su aspecto y facilidad de lectura
    public void showBoard(char[][] board) {
        //throw new ExecutionControl.NotImplementedException("");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        //System.out.println("Is the turn for the player " + playerTurn + ".");
    }
    // Empieza especificando el turno del jugador
    // Crea un array con dos posiciones [0] = Y, [1] = X que leera por el escaner y las devolvera, normalment este metodo es ejecutado por el metodo play() que usara esos dos aprametros para la jugada.
    // Falta añadirle un filtro para las casillas para que solo permita valores existentes del board
    public short[] pickMove(short playerTurn) {
        System.out.println("Is the turn for the player " + playerTurn + ".");
        System.out.println("Y and X values: ");
        short[] pos = new short[2];

        pos[0] = (short)  (sc.nextShort()-1);
        pos[1] = (short)  (sc.nextShort()-1);
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
    // Este metodo sirve para que se puedan hacer prints simples desde otros metodos
    public void message(String message) {
        System.out.println(message);
    }
    public void createDir() {
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Directory succesfully created.");
        }else {
            System.out.println("I'm sorry but I couldn't create the directory :(");
        }
    }
    public void createFile() throws IOException {
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        }else {
            System.out.println("The file already exists.");
        }
    }
    public void createFileAlone() throws IOException {
        if (fileAlone.createNewFile()) {
            System.out.println("File created: " + fileAlone.getName());
        }else {
            System.out.println("The file already exists.");
        }
    }
    public void writeFile() throws IOException {
        String toSave = "This is supposed to be saved.";
        FileWriter myWriter = new FileWriter("config.txt");
        myWriter.write(toSave);
        myWriter.close();
        System.out.println("File successfully written.");
    }
}
