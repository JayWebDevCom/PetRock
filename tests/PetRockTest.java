import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jaiye on 17/07/17.
 */
public class PetRockTest {

    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testHappyBeforePlay() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
        rocky.playWithToy();
        assertTrue(rocky.isHappy());
    }

}