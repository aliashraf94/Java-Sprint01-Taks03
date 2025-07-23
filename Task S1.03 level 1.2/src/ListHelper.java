import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListHelper {
    // createOriginalList method which Creates and return a list of integers
    public static List<Integer> createOriginalList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        return list;
    }

    // reverseList method which reverse the list by using ListIterator
    public static List<Integer> reverseList(List<Integer> originalList) {
        List<Integer> reverseList = new ArrayList<>();
        ListIterator<Integer> iterator = originalList.listIterator(originalList.size());
        while (iterator.hasPrevious()) {
            reverseList.add(iterator.previous());
        }
        return reverseList;
    }

    // Creating a method which will print any list of integers by passing to it
    public static void printList(List<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
