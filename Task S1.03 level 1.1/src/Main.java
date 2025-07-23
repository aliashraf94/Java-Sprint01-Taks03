import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Creating ArrayList of months except August

        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));
//        months.add(new Month("December"));

        // Adding Month august index 7 position 8th
        months.add(7, new Month("August"));

        // Printing Array List
        System.out.println("Array List in order");
        for (int i=0; i < months.size(); i++) {
            System.out.println(months.get(i));
        }

        // Covert ArrayList to HashSet
        HashSet<Month> monthSet = new HashSet<>(months);

        // Print the HashSet (order may be different)
        System.out.println("\nHashSet (no duplicates):");
        // We convert to ArrayList again just to print with a loop easily
        ArrayList<Month> listFromSet = new ArrayList<>(monthSet);
        for (int i = 0; i < listFromSet.size(); i++) {
            System.out.println(listFromSet.get(i));
        }

        // Use an Iterator to loop through the original list
        System.out.println("\nUsing Iterator:");
        Iterator<Month> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}