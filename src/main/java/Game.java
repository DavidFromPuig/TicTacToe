import jdk.jshell.spi.ExecutionControl;

public class Game{
    char[][] board = new char[3][3];
    short playerTurn;

    //This method prepares the board, the turn
    public void newGame() {
        this.board = new char[3][3];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = '-';
            }
        }
        this.playerTurn = 1;
    }

    public void blankBoard() { //El método recorre cada elemento de la matriz y lo establece como un carácter de espacio (' ').
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = '-';
            }
        }
    }
    //Lo que quiere decir que después de llamar a este método, el tablero estará vacío y listo para ser utilizado.

    public char[][] getBoard() {
        return board;
    }

    public short isPlayerTurn() {
        return playerTurn;
    }

    public void play(int posY, int posX) throws ExecutionControl.NotImplementedException { // este método maneja el proceso de juego para colocar fichas en el tablero, alternando y verificando si una posición ya está ocupada antes de colocar una ficha.

        if(playerTurn % 2 != 0){
            if(getBoard()[posY][posX] != 'O' || getBoard()[posY][posX] != 'X'){
                getBoard()[posY][posX]='O';
                playerTurn++;
            }
            else {
                System.out.println("That tile is not empty, true");
            }
        }
        else {
            if(getBoard()[posY][posX] != 'O' || getBoard()[posY][posX] != 'X'){
                getBoard()[posY][posX]='X';
                playerTurn++;
            }
            else {
                System.out.println("That tile is not, false");
            }
        }
        //throw new ExecutionControl.NotImplementedException("");
    }

    public void winnerMove() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
