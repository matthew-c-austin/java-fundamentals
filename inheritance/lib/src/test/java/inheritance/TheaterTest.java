package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {
    // Declaring ANSI_GREEN to color the successful test souts :)
    public static final String ANSI_GREEN = "\u001B[32m";
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    @Test
    void testConstructor() {
        Theater classUnderTest = new Theater("AMC", 2);
        assertEquals(classUnderTest.getName(), "AMC");
        assertEquals(classUnderTest.getStars(), 0, 0.00001);
        assertEquals(classUnderTest.getPriceCategory(), 2);
        System.out.println(ANSI_GREEN + "testConstructor() - test passed successfully" + ANSI_RESET);
    }

    @Test void testConstructorThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Theater("Invalid Price Category", 6));
        System.out.println(ANSI_GREEN + "testConstructorThrowsIllegalArgumentException() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testAddMovie() {
        Theater classUnderTest = new Theater("AMC", 2);
        classUnderTest.addMovie("Koyaanisqatsi");
        List<String> expectedList = new ArrayList<>(Arrays.asList("Koyaanisqatsi"));
        assertEquals(expectedList, classUnderTest.getNowShowingList());
        System.out.println(ANSI_GREEN + "testAddMovie() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testRemoveMovie() {
        Theater classUnderTest = new Theater("AMC", 2);
        classUnderTest.addMovie("Koyaanisqatsi");
        classUnderTest.removeMovie("Koyaanisqatsi");
        List<String> expectedList = new ArrayList<>();
        assertEquals(expectedList, classUnderTest.getNowShowingList());
        System.out.println(ANSI_GREEN + "testRemoveMovie() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testToString() {
        Theater classUnderTest = new Theater("AMC", 2);
        classUnderTest.addMovie("Koyaanisqatsi");
        assertEquals("Theater { name: \"AMC\", stars: 0.0, priceCategory: \"$$\", nowShowingList: \"[Koyaanisqatsi]\" }", classUnderTest.toString());
        System.out.println(ANSI_GREEN + "testToString() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testTheaterReviewAssociation() {
        Theater classUnderTest = new Theater("AMC", 2);
        Review review = new Review("Mr. Critic", 5, "Savory movies and even savory-er popcorn!", classUnderTest);

        assertEquals(1, classUnderTest.getReviews().size());
        assertTrue(classUnderTest.getReviews().contains(review));
        System.out.println(ANSI_GREEN + "testTheaterReviewAssociation() - test passed successfully" + ANSI_RESET);
    }

    @Test
    public void testStarRatingUpdate() {
        Theater classUnderTest = new Theater("AMC", 2);
        Review reviewOne = new Review("Mr. Critic", 5, "Savory movies and even savory-er popcorn!", classUnderTest);
        Review reviewTwo = new Review("Mrs. Critic", 1, "Trite movies and even trite-er popcorn!", classUnderTest);

        assertEquals(3, classUnderTest.getStars(), 0.001);

        // Add the same review again and check if the star rating remains the same
        classUnderTest.addReview(reviewOne);
        // Check if the average star rating is still 4.5
        assertEquals(3, classUnderTest.getStars(), 0.001);
        System.out.println(ANSI_GREEN + "testStarRatingUpdate() - test passed successfully" + ANSI_RESET);
    }
}
