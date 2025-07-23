import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // TreeSet automatically keeps elements sorted using compareTo() and avoids duplicates
        Set<Restaurant> restaurants = new TreeSet<>();

        // Adding sample restaurants
        restaurants.add(new Restaurant("Honest Green", 9));
        restaurants.add(new Restaurant("Honest Green", 7));
        restaurants.add(new Restaurant("Paloma Blanca", 8));
        restaurants.add(new Restaurant("Paloma Blanca", 8)); // Duplicate: same name and score
        restaurants.add(new Restaurant("Bismillah Kebabish", 10));
        restaurants.add(new Restaurant("Bismillah Kebabish", 9));

        // Using an Iterator to loop through the TreeSet
        Iterator<Restaurant> iterator = restaurants.iterator();
        while (iterator.hasNext()) {
            Restaurant r = iterator.next();
            System.out.println("name: " + r.getName() + ", rating: " + r.getScore());
        }
    }
}
