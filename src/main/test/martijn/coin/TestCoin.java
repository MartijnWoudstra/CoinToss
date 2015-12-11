package martijn.coin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Martijn on 11-12-2015.
 */
public class TestCoin {

    Game game;

    @Before
    public void setup(){
        game = new Game();
    }

    @Test
    public void testGame(){
        assertEquals(2, game.getNumberOfSides());
    }

    @Test
    public void testSide(){
        Side s = Side.HEADS;
        assertTrue(game.getSide().equals(s));
    }
}
