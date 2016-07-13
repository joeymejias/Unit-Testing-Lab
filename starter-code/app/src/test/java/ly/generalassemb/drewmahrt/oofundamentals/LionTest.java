package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by joey on 7/13/16.
 */
public class LionTest {
    @Test
    public void topSpreedTest(){
        Lion lion = new Lion(true);
        lion.setTopSpeed(100);
        assertEquals(100, lion.getTopSpeed());
    }

    @Test
    public void isAlphaTestTrue(){
        Lion lion = new Lion(true);
        assertTrue(lion.isAlpha());
    }

    @Test
    public void isAlphaTestFalse(){
        Lion lion = new Lion(false);
        assertFalse(lion.isAlpha());
    }

    @Test
    public void makeNoiseTest() throws Exception {
        Lion lion = new Lion(true);
        assertEquals("Roar!!!", lion.makeNoise());
    }

    @Test
    public void toStringTest() throws Exception {
        Lion lion = new Lion(true);
        assertEquals("Lion (Alpha)", lion.toString());
    }
}
