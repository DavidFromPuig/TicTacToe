import jdk.jshell.spi.ExecutionControl;


import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    //Test de new Game que llama a newGame_player y newGame_board
    @org.junit.jupiter.api.Test
    void testnewGame() throws ExecutionControl.NotImplementedException {
        newGame_player();
    }

    @org.junit.jupiter.api.Test
    void newGame_player() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();
        assertTrue(game.isPlayerTurn() % 2 != 0);
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
        //assertArrayEquals(new char[3][3], game.getBoard());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(' ', game.getBoard()[i][j]);

            }
        }
    }

    @org.junit.jupiter.api.Test
    void play() throws ExecutionControl.NotImplementedException {
        Game game = new Game();
        game.newGame();
        short[] pos = new short[2];
        pos[0] = 0;
        pos[1] = 0;
        game.play(pos);
        assertEquals(' ', game.getBoard()[pos[0]][pos[1]]);
    }

    @org.junit.jupiter.api.Test
        //Bucle que comprueba si cada casilla del tablero está vacia
    void blankBoard() {
        Game game = new Game();
        game.blankBoard();
        for (int i = 0; i < game.getBoard().length; ++i) {
            for (int j = 0; j < game.getBoard().length; ++j) {
                assertEquals(' ', game.getBoard()[i][j]);
            }
        }
    }

}