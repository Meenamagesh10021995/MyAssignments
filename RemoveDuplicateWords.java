package assignment3;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputText = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] words = inputText.split(" ");
		  // Create two nested for loops to compare each word with every other word
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Compare words case-insensitively
                if (words[i].equalsIgnoreCase(words[j])) {
                    // Replace duplicate word with an empty string
                    words[j] = "";
                    count++;
                }
            }
        }

        // After comparing all words, if count > 0, print the modified words array
        if (count > 0) {
            System.out.println("Original text: " + inputText);
            System.out.print("Modified text with duplicates removed: ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    System.out.print(word + " ");
                }
            }
        } else {
            System.out.println("No duplicate words found in the text.");
        }
    }
}


