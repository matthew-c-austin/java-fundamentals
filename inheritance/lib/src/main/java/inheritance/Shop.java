package inheritance;

public class Shop extends Destination{
    // Fields
    private final String description;

    // Constructor
    public Shop(String name, int priceCategory, String description) {
        super(name, priceCategory);
        this.description =  description;
    }

    // Methods
    @Override
    public String toString() {
        StringBuilder dollarSigns = new StringBuilder();
        for (int i = 0; i < this.getPriceCategory(); i++) {
            dollarSigns.append("$");
        }
        return String.format("Shop { name: \"%s\", stars: %.1f, priceCategory: \"%s\", description: \"%s\" }", this.getName(), this.getStars(), dollarSigns, this.description);
    }
}
