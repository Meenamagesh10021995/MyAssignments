package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindingMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(array);
		// Convert the array to a list
        List<Integer> list = new ArrayList<Integer>();
        for (Integer num : array) {
            list.add(num);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int currentElement = list.get(i);
            int nextElement = list.get(i + 1);

            if (currentElement + 1 != nextElement) {
                int missingElement = currentElement + 1;
                System.out.println("Missing element in the list: " + missingElement);
                
            }
        }
    }
}



		

	


