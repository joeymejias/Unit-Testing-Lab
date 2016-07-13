package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by joey on 7/13/16.
 */
public class PikachuTest {
    @Test
    public void topSpreedTest(){
        Pikachu pikachu = new Pikachu(true);
        pikachu.setTopSpeed(100);
        assertEquals(100, pikachu.getTopSpeed());
    }

    @Test
    public void isAwesomeTestTrue(){
        Pikachu Pikachu = new Pikachu(true);
        assertTrue(Pikachu.isAwesome());
    }

    @Test
    public void isAwesomeTestFalse(){
        Pikachu Pikachu = new Pikachu(false);
        assertFalse(Pikachu.isAwesome());
    }

    @Test
    public void makeNoiseTest() throws Exception {
        Pikachu Pikachu = new Pikachu(true);
        assertEquals("Pika pika!", Pikachu.makeNoise());
    }

    @Test
    public void toStringTest() throws Exception {
        Pikachu Pikachu = new Pikachu(true);
        assertEquals("Pikachu (Awesome)", Pikachu.toString());
    }
}
