import jdk.jshell.spi.ExecutionControl;

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
        game.play(0,0);
        assertEquals(game.getBoard()[0][0],'o');
    }


}