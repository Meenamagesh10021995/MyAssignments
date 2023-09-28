package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array and add values to it
        String[] companiesArray = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Convert the array to a List
        List<String> companiesList = new ArrayList<>(Arrays.asList(companiesArray));

        // Iterate through the list
        for (String company : companiesList) {
            System.out.println(company);
        }

        // Print the required output: Wipro, HCL, CTS, Aspire Systems
        
        Collections.sort(companiesList);//Arrange them in ascending order
        Collections.reverse(companiesList); // Reverse the list
        System.out.println("Required output:");
        for (String company : companiesList) {
            System.out.println(company);
        }
    }
}






