import jdk.jshell.spi.ExecutionControl;
public class Game{
    char[][] board;
    public Game() {
        board = new char[3][3];

    }
    private void blankBoard() {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board.length; ++j) {
                board[i][j] = ' ';
            }
        }
    }
    private boolean playerTurn;

    public char[][] getBoard() {
        return board;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void newGame() throws ExecutionControl.NotImplementedException {
        this.board = new char[3][3];
        this.playerTurn = true;
    }
    public void play(int posY, int posX) throws ExecutionControl.NotImplementedException {
        getBoard()[posY][posX] = 'O';
        //throw new ExecutionControl.NotImplementedException("");
    }
    public void winnerMove() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
