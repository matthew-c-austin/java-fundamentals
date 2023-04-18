/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void testNumberOfRolls() {
        Library classUnderTest = new Library();
        // Ensure that rolls array returns the right number of rolls
        int[] rolls = classUnderTest.roll(5);
        int numberOfRolls = rolls.length;
        assertEquals(5, numberOfRolls);
    }

    @Test void testRollsRange() {
        // Ensure that rolls array returns rolls that are between 1 and 6 for every roll
        Library classUnderTest = new Library();
        int[] rolls = classUnderTest.roll(5);
        for (int roll : rolls) {
            System.out.println(roll);
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}
