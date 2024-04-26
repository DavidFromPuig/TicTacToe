import jdk.jshell.spi.ExecutionControl;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @org.junit.jupiter.api.Test
    void newGame_player() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();
        assertTrue(game.isPlayerTurn());
    }

    @org.junit.jupiter.api.Test
    void newGame_board() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();

        char[][] esperat = new char[3][3];
        char[][] trobat = game.getBoard();

        assertArrayEquals(esperat, trobat);
    }

    @org.junit.jupiter.api.Test
    void play() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();
        game.play();
    }
}