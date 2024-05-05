import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    //Test de new Game que llama a newGame_player y newGame_board
    @org.junit.jupiter.api.Test
    void testnewGame() throws ExecutionControl.NotImplementedException {
        newGame_player();
        newGame_board();
    }

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

        /* Understable version
        char[][] esperat = new char[3][3];
        char[][] trobat = game.getBoard();
        assertArrayEquals(esperat, trobat);
        */
        assertArrayEquals(new char[3][3], game.getBoard());


    }

    @org.junit.jupiter.api.Test
    void play() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();
        short y = 0, x = 0;
        game.play(y, x);
        assertEquals(game.getBoard()[y][x], 'O');
    }

    @org.junit.jupiter.api.Test //Bucle que comprueba si cada casilla del tablero está vacia
    void blankBoard() {
        Game game = new Game();
        game.blankBoard();
        for (int i = 0; i < game.board.length; ++i) {
            for (int j = 0; j < game.board.length; ++j) {
                assertEquals(game.board[i][j], ' ');
            }
        }

    }


}