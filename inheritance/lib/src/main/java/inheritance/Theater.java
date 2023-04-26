package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Destination{
    // Fields
    private final List<String> nowShowingList;

    // Constructors
    public Theater(String name, int priceCategory) {
        super(name, priceCategory);
        this.nowShowingList = new ArrayList<>();
    }

    public Theater(String name, int priceCategory, String chainName) {
        super(name, priceCategory, chainName);
        this.nowShowingList = new ArrayList<>();
    }

    // Methods
    public void addMovie(String movieTitle) {
        if (!this.nowShowingList.contains(movieTitle)) {
            this.nowShowingList.add(movieTitle);
        }
    }

    public void removeMovie(String movieTitle) {
        this.nowShowingList.remove(movieTitle);
    }

    @Override
    public String toString() {
        StringBuilder dollarSigns = new StringBuilder();
        for (int i = 0; i < this.getPriceCategory(); i++) {
            dollarSigns.append("$");
        }
        return String.format("Theater { name: \"%s\", stars: %.1f, priceCategory: \"%s\", nowShowingList: \"%s\" }", this.getName(), this.getStars(), dollarSigns, this.getNowShowingList());
    }

    // Getters and Setters
    public List<String> getNowShowingList() {
        return nowShowingList;
    }

}
