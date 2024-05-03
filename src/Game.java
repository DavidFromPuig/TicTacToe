import jdk.jshell.spi.ExecutionControl;

public class Game {
    private char[][] board;
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
