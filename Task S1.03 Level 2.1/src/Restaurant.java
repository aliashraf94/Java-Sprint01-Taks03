public class Restaurant {
    // Attributes for restaurant name and score
    private String name;
    private int score;

    // Constructor to initialize the restaurant object
    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Override equals to define when two restaurants are equal
    @Override
    public boolean equals(Object obj) {
        // If same object reference, they are equal
        if (this == obj) {
            return true;
        }
        // If the other object is null or not the same class, not equal
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast obj to Restaurant to compare attributes
        Restaurant other = (Restaurant) obj;

        // Compare scores first
        if (score != other.score) {
            return false;
        }
        // Compare names (handle possible nulls)
        return name != null ? name.equals(other.name) : other.name == null;
    }

    // Override hashCode to match equals logic
    @Override
    public int hashCode() {
        int result = (name != null) ? name.hashCode() : 0;
        // Multiply by 31 and add score for a decent distribution
        result = 31 * result + score;
        return result;
    }
}
