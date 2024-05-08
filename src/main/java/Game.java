import jdk.jshell.spi.ExecutionControl;

public class Game{
    char[][] board = new char[3][3];

    //This method prepares the board, the turn
    public void newGame() throws ExecutionControl.NotImplementedException {
        this.board = new char[3][3];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = '-';
            }
        }
        this.playerTurn = true;
    }

    public void blankBoard() { //El método recorre cada elemento de la matriz y lo establece como un carácter de espacio (' ').
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = '-';
            }
        }
    }
    //Lo que quiere decir que después de llamar a este método, el tablero estará vacío y listo para ser utilizado.



    private boolean playerTurn;

    public char[][] getBoard() {
        return board;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }


    public void play(int posY, int posX) throws ExecutionControl.NotImplementedException { // este método maneja el proceso de juego para colocar fichas en el tablero, alternando y verificando si una posición ya está ocupada antes de colocar una ficha.

        if(playerTurn){
            if(getBoard()[posY][posX] != 'O' || getBoard()[posY][posX] != 'X'){
                getBoard()[posY][posX]='O';
                playerTurn = false;
            }
            else {
                System.out.println("Casilla ocupada del player true");
            }
        }
        else {
            if(getBoard()[posY][posX] != 'O' || getBoard()[posY][posX] != 'X'){
                getBoard()[posY][posX]='X';
                playerTurn = true;
            }
            else {
                System.out.println("Casilla ocupada del player false");
            }
        }
        //throw new ExecutionControl.NotImplementedException("");
    }

    public void winnerMove() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
