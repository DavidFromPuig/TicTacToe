import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class JocTest {

    @org.junit.jupiter.api.Test
    void newGame_jugador() {
        Joc j = new Joc();
        assertTrue(j.isPlayerTurn());
    }

    @org.junit.jupiter.api.Test
    void newGame_taulell() {
        Joc j = new Joc();
        assertEquals([][], j.getBlankBoard());
    }

    @org.junit.jupiter.api.Test
    void play() {
    }
}