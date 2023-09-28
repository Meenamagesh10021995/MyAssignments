package assignment3;

import java.util.ArrayList;
import java.util.List;

public class CompareArrays {
    public static void main(String[] args) {
    	List<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(2);
        list1.add(11);
        list1.add(4);
        list1.add(6);
        list1.add(7);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(8);
        list2.add(4);
        list2.add(9);
        list2.add(7);
        // Find the intersection of the two lists
        List<Integer> intersection = new ArrayList<>();

        for (Integer element : list1) {
            if (list2.contains(element)) {
                intersection.add(element);
            }
        }

        // Print the intersection
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Intersection: " + intersection);
    }
}


 
       





     








      

