package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Destination implements Reviewable {
    // Fields
    private final String name;
    private String chainName;
    private final int priceCategory;
    private final List<Review> reviews;

    // Constructors
    public Destination(String name, int priceCategory) {
        this.name = name;
        // Limit the price category between 1 and 4
        if (priceCategory < 1 || priceCategory > 4) {
            throw new IllegalArgumentException("Price category must be between 1 and 4");
        }
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public Destination(String name, int priceCategory, String chainName) {
        this.name = name;
        this.chainName = chainName;
        // Limit the price category between 1 and 4
        if (priceCategory < 1 || priceCategory > 4) {
            throw new IllegalArgumentException("Price category must be between 1 and 4");
        }
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    // Methods
    @Override
    public String toString() {
        StringBuilder dollarSigns = new StringBuilder();
        for (int i = 0; i < priceCategory; i++) {
            dollarSigns.append("$");
        }
        return String.format("Restaurant { name: \"%s\", stars: %.1f, priceCategory: \"%s\" }", name, this.getStars(), dollarSigns);
    }

    public double getStars() {
        if (this.reviews.isEmpty()) {
            return 0;
        }

        double totalStars = 0;

        for (Review review: this.reviews) {
            totalStars += review.getStars();
        }

        return totalStars / this.reviews.size();
    }

    // Interface Methods
    @Override
    public void addReview(Review review) {
        // Test to see if the review exists
        if (reviews.contains(review)) {
            return;
        }

        reviews.add(review);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String getChainName() {
        return chainName;
    }
}
