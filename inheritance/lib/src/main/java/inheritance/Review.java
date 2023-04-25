/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Review {
    // Fields
    private String author;
    private int stars;
    private String body;
    private final Destination destination;

    // Constructor
    public Review(String author, int stars, String body, Destination destination) {
        this.author = author;

        // Limit the stars to between 1 and 5
        if (stars < 1 || stars > 5) {
            throw new IllegalArgumentException("Stars must be between 1 and 5");
        }

        this.stars = stars;
        this.body = body;
        this.destination = destination;
        destination.addReview(this);
    }

    //Methods
    @Override
    public String toString() {
        return String.format("Review { author: \"%s\", stars: %d, body: \"%s\" }", this.author, this.stars, this.body);
    }

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }

    public void updateStars(int newStars) {
        this.stars = newStars;
    }

    public String getBody() {
        return body;
    }

    public Destination getDestination() {
        return destination;
    }
}
