/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String chainName;
    private int priceCategory;
    private List<Review> reviews;


     public Restaurant(String name, int priceCategory) {
        this.name = name;
        // Limit the price category between 1 and 4
        if (priceCategory < 1 || priceCategory > 4) {
            throw new IllegalArgumentException("Price category must be between 1 and 4");
        }
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, int priceCategory, String chainName) {
        this.name = name;
        this.chainName = chainName;
        // Limit the price category between 1 and 4
        if (priceCategory < 1 || priceCategory > 4) {
            throw new IllegalArgumentException("Price category must be between 1 and 4");
        }
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        // Test to see if the review exists
        if (reviews.contains(review)) {
            return;
        }

        reviews.add(review);
    }

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

    public String getName() {
        return name;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
