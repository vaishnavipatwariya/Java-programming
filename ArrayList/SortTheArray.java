//Write a program to sort an ArrayList of String in descending order
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//
public class SortTheArray {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(1);

        System.out.println("Original list " +list);
        Collections.reverse(list);
        System.out.println("Reversed list " +list);
        Collections.sort(list);
        System.out.println("Sorted list(Ascending order) " +list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list(Descending order) " +list);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome ");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("Original list " +l1);
        Collections.sort(l1);
        System.out.println("sorted "+l1);

        System.out.println();
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
    }
}
