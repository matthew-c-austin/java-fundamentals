package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    // Declaring ANSI_GREEN to color the successful test souts :)
    public static final String ANSI_GREEN = "\u001B[32m";
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    @Test
    void testConstructor() {
        Shop classUnderTest = new Shop("Steam and Steel", 3, "During daylight hours, smoke and steam billow from the many windows around this indoor forge where metal weapons, armor, and tools are made. The forge is owned and operated by a married couple: a fire genasi named Embric and a water genasi named Avi. Both are members of the Most Careful Order of Skilled Smiths and Metalforgers. As an armorer, Avi also belongs to the Splendid Order of Armorers, Locksmiths, and Finesmiths.");
        assertEquals(classUnderTest.getName(), "Steam and Steel");
        assertEquals(classUnderTest.getStars(), 0, 0.00001);
        assertEquals(classUnderTest.getPriceCategory(), 3);
        System.out.println(ANSI_GREEN + "testConstructor() - test passed successfully" + ANSI_RESET);
    }

    @Test void testConstructorThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Shop("Invalid Price Category", 6, "Invalid Price Category"));
        System.out.println(ANSI_GREEN + "testConstructorThrowsIllegalArgumentException() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testToString() {
        Shop classUnderTest = new Shop("Steam and Steel", 3, "During daylight hours, smoke and steam billow from the many windows around this indoor forge where metal weapons, armor, and tools are made. The forge is owned and operated by a married couple: a fire genasi named Embric and a water genasi named Avi. Both are members of the Most Careful Order of Skilled Smiths and Metalforgers. As an armorer, Avi also belongs to the Splendid Order of Armorers, Locksmiths, and Finesmiths.");
        assertEquals("Shop { name: \"Steam and Steel\", stars: 0.0, priceCategory: \"$$$\", description: \"During daylight hours, smoke and steam billow from the many windows around this indoor forge where metal weapons, armor, and tools are made. The forge is owned and operated by a married couple: a fire genasi named Embric and a water genasi named Avi. Both are members of the Most Careful Order of Skilled Smiths and Metalforgers. As an armorer, Avi also belongs to the Splendid Order of Armorers, Locksmiths, and Finesmiths.\" }", classUnderTest.toString());
        System.out.println(ANSI_GREEN + "testToString() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testShopReviewAssociation() {
        Shop classUnderTest = new Shop("Steam and Steel", 3, "During daylight hours, smoke and steam billow from the many windows around this indoor forge where metal weapons, armor, and tools are made. The forge is owned and operated by a married couple: a fire genasi named Embric and a water genasi named Avi. Both are members of the Most Careful Order of Skilled Smiths and Metalforgers. As an armorer, Avi also belongs to the Splendid Order of Armorers, Locksmiths, and Finesmiths.");
        Review review = new Review("Mr. Critic", 5, "Cute couple and even cuter weapons!", classUnderTest);

        assertEquals(1, classUnderTest.getReviews().size());
        assertTrue(classUnderTest.getReviews().contains(review));
        System.out.println(ANSI_GREEN + "testShopReviewAssociation() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testStarRatingUpdate() {
        Shop classUnderTest = new Shop("Steam and Steel", 3, "During daylight hours, smoke and steam billow from the many windows around this indoor forge where metal weapons, armor, and tools are made. The forge is owned and operated by a married couple: a fire genasi named Embric and a water genasi named Avi. Both are members of the Most Careful Order of Skilled Smiths and Metalforgers. As an armorer, Avi also belongs to the Splendid Order of Armorers, Locksmiths, and Finesmiths.");
        Review reviewOne = new Review("Mr. Critic", 5, "Cute couple and even cuter weapons!", classUnderTest);
        Review reviewTwo = new Review("Mrs. Critic", 1, "The smoke and the smell are something awful, and the two lovestruck proprietors can't peel their eyes away from each other long enough to properly address a paying customer.", classUnderTest);

        assertEquals(3, classUnderTest.getStars(), 0.001);

        // Add the same review again and check if the star rating remains the same
        classUnderTest.addReview(reviewOne);
        // Check if the average star rating is still 4.5
        assertEquals(3, classUnderTest.getStars(), 0.001);
        System.out.println(ANSI_GREEN + "testStarRatingUpdate() - test passed successfully" + ANSI_RESET);
    }
}
