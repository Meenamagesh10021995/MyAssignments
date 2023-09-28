package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(4);
        list.add(6);
        list.add(7);
		Collections.sort(list);
		System.out.println(list);
		//int size;
		System.out.println("Second Largest number is"+ list.size());
		
		
		}
		
	}


