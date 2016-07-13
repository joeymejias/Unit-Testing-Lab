package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by joey on 7/13/16.
 */
public class ZooTest {
    @Test
    public void zooAddTest() throws Exception{
        Zoo zoo = Zoo.getInstance();
        zoo.addAnimal(new Lion(true));
        assertNotNull(zoo.getAnimals());
    }

    @Test
    public void zooRemoveTest() throws Exception{
        Zoo zoo = Zoo.getInstance();
        zoo.removeAnimal();
//        zoo.getAnimals().remove(0);
        assertEquals(0, zoo.getAnimals().size());
    }
}
