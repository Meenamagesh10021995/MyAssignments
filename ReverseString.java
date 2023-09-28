package assignment3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputText = "I am a Software Tester";

        // Split the input text into words using space as the delimiter
        String[] words = inputText.split(" ");

        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) { // Check if the position is odd (0-based index)
                // Reverse the word at the odd position
                String reversedWord = reverseWord(words[i]);
                result.append(reversedWord);
            } else {
                // Append the word at even positions as is
                result.append(words[i]);
            }

            // Add a space between words unless it's the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        // Print the modified text
        System.out.println("Original text: " + inputText);
        System.out.println("Modified text with odd position words reversed: " + result.toString());

        // Print odd index words
        System.out.println("Words at odd indices:");
        for (int i = 1; i < words.length; i += 2) {
            System.out.println(words[i]);
        }
    }

    // Method to reverse a word
    private static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return reversedWord.toString();
    }
}





	


