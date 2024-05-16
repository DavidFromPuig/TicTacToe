import jdk.jshell.spi.ExecutionControl;

public class Game{
    char[][] board = new char[3][3];
    short playerTurn;

    //Prepara el tablero en su setsado inicial para una nueva partida i da le turno al Jugador 1
    public void newGame() {
        this.board = new char[3][3];
        blankBoard();
        this.playerTurn = 1;
    }
    //Pone todos los valores de la matriz del tablero en '-' con dos bucles que lo recorren entero, indicando que esta vacío
    public void blankBoard() { //El método recorre cada elemento de la matriz y lo establece como un carácter de espacio (' ').
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = '-';
            }
        }
    }
    //Lo que quiere decir que después de llamar a este método, el tablero estará vacío y listo para ser utilizado.

    //Permite llamar al tablero, modificarlo y devolvero guardando esas modificaciones
    public char[][] getBoard() {
        return board;
    }
    //Permite obtener el turno del jugador, modificar su valor y devolvero guardando los cambios
    public short isPlayerTurn() {
        return playerTurn;
    }
    //Pone la ficha done el metodo pickMove() le dice y segun el turno del jugador, y si no se puede avisa de que la casilla ya esta ocupada
    public void play(short[] pos) { // este método maneja el proceso de juego para colocar fichas en el tablero, alternando y verificando si una posición ya está ocupada antes de colocar una ficha.
        if(playerTurn % 2 != 0){
            if(getBoard()[pos[0]][pos[1]] == '-'){   //getBoard()[pos[0]][pos[1]] != 'O' || getBoard()[pos[0]][pos[1]] != 'X'
                getBoard()[pos[0]][pos[1]]='O';
                playerTurn++;
            }
            else {
                System.out.println("That tile is not empty, player 1");
            }
        }
        else {
            if(getBoard()[pos[0]][pos[1]] == '-'){ //getBoard()[pos[0]][pos[1]] != 'O' || getBoard()[pos[0]][pos[1]] != 'X'
                getBoard()[pos[0]][pos[1]]='X';
                playerTurn++;
            }
            else {
                System.out.println("That tile is not empty, player 2");
            }
        }
    }
    //En desarrollo, pero deberia comprobar si alguien ha hecho una jugada que daría fin a la partida con un victoria y encargado de saber si se ha empatado por tener el tablero lleno
    public boolean winnerMove() {
        if (playerTurn < 0){
            return false;
        } else{
          if (getBoard()[0][0] == 'O'){
              return  false;
          } else{
              return false;
          }
        }
        //return false;
    }
}