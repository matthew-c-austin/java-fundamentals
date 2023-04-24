/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private double stars;
    private int priceCategory;
    private List<Review> reviews;

    public Restaurant(String name, double stars, int priceCategory) {
        this.name = name;

        // Limit the stars to between 1 and 5
        if (stars < 1 || stars > 5) {
            throw new IllegalArgumentException("Stars must be between 1 and 5");
        }
        this.stars = stars;

        // Limit the price category between 1 and 4
        if (priceCategory < 1 || priceCategory > 4) {
            throw new IllegalArgumentException("Price category must be between 1 and 4");
        }
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        StringBuilder dollarSigns = new StringBuilder();
        for (int i = 0; i < priceCategory; i++) {
            dollarSigns.append("$");
        }
        return String.format("Restaurant { name: \"%s\", stars: %.1f, priceCategory: \"%s\" }", name, stars, dollarSigns.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
