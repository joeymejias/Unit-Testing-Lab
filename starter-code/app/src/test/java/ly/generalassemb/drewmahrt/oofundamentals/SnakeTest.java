package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by joey on 7/13/16.
 */
public class SnakeTest {
    @Test
    public void topSpreedTest(){
        Snake snake = new Snake(true);
        snake.setTopSpeed(100);
        assertEquals(100, snake.getTopSpeed());
    }
    @Test
    public void makeNoiseTest(){
        Snake snake = new Snake(true);
        assertNotNull(snake.makeNoise());
        assertEquals("Hiss!!!", snake.makeNoise());
    }
}
