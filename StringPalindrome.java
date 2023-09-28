package assignment3;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input the string
        String inputString = "Madam";

        // Initialize an empty string to store the reversed characters
        StringBuilder reversedString = new StringBuilder();

        // Convert the string into a character array
        char[] charArray = inputString.toCharArray();

        // Iterate the characters using a for loop and append them to the reversed string
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }

        // Compare the original value with the reversed string to check if it's a palindrome
        boolean isPalindrome = inputString.equals(reversedString.toString());

        // Print the result
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString.toString());
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}



	
