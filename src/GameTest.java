import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @org.junit.jupiter.api.Test
    void newGame_jugador() {
        Game j = new Game();
        assertTrue(j.isPlayerTurn());
    }

    @org.junit.jupiter.api.Test
    void newGame_taulell() {
        Game j = new Game();
        assertEquals([][], j.getBlankBoard());
    }

    @org.junit.jupiter.api.Test
    void play() {
    }
}