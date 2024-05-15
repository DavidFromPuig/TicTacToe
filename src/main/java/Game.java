import jdk.jshell.spi.ExecutionControl;

public class Game{
    private char[][] board;
    short playerTurn;

    //Esto prepara el tablero
    public void newGame() {
        this.board = new char[3][3];
        blankBoard();
        this.playerTurn = 1;
    }

    public void blankBoard() { //El método recorre cada elemento de la matriz y lo establece como un carácter de espacio ('|').
        board = new char[3][3];
    for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = ' ';
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

    public void play(short[] pos) { // este método maneja el proceso de juego para colocar fichas en el tablero, alternando y verificando si una posición ya está ocupada antes de colocar una ficha.
        if(playerTurn % 2 != 0){
            if(getBoard()[pos[0]][pos[1]] == '|'){   //getBoard()[pos[0]][pos[1]] != 'O' || getBoard()[pos[0]][pos[1]] != 'X'
                getBoard()[pos[0]][pos[1]]='O';
                playerTurn++;
            }
            else {
                System.out.println("this box is not empty, true");
            }
        }
        else {
            if(getBoard()[pos[0]][pos[1]] == '|'){ //getBoard()[pos[0]][pos[1]] != 'O' || getBoard()[pos[0]][pos[1]] != 'X'
                getBoard()[pos[0]][pos[1]]='X';
                playerTurn++;
            }
            else {
                System.out.println("That tile is not empty, false");
            }
        }
        //throw new ExecutionControl.NotImplementedException("");
    }

    public boolean winnerMove() {
        return true;
    }

}
