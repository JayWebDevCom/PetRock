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

    @Test (expected = IllegalStateException.class)
    public void printHappyMessageThrows() throws IllegalStateException {
        rocky.getHappyMessage();
    }

    @Test
    public void printHappyMessageReturns() throws IllegalStateException {
        rocky.playWithToy();
        String message = "I am happy";
        assertEquals(message, rocky.getHappyMessage());
    }
}