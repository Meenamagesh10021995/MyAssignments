package assignment3;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString1 = "Shavin";
        String inputString2 = "Dashvin";
        //WebDriver driver = new ChromeDriver();
        boolean areLengthsEqual = inputString1.length() == inputString2.length();
        if (areLengthsEqual) {
            System.out.println("The lengths of the two strings are equal.");
        } else {
            System.out.println("The lengths of the two strings are not equal.");
           // System.exit(1);
        }
        char[] charArray1 = inputString1.toCharArray();
        char[] charArray2 = inputString2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram");
        }
        

}
}