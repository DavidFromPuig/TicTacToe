import jdk.jshell.spi.ExecutionControl;

public class Game {
    private int[][] blankBoard;
    private boolean playerTurn;

    public int[][] getBlankBoard() {
        return blankBoard;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void newGame(){
        this.blankBoard = new int[3][3];
        this.playerTurn = true;
    }
    public void play() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
    public void winnerMove(){

    }
}
