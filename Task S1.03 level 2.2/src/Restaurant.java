public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    // Constructor
    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Override equals to prevent duplicates based on name and score
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Restaurant other = (Restaurant) obj;
        if (score != other.score) return false;
        return name != null ? name.equals(other.name) : other.name == null;
    }

    // Generate hashCode based on name and score
    @Override
    public int hashCode() {
        int result = (name != null) ? name.hashCode() : 0;
        result = 31 * result + score;
        return result;
    }

    // Sorting logic: first by name (A-Z), then by score (high to low)
    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison; // Sort by name
        }
        return Integer.compare(other.score, this.score); // Sort score in descending order
    }
}
