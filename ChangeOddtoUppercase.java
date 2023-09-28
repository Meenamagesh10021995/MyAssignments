package assignment3;

public class ChangeOddtoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Stringtest = "changeme";
		//WebDriver driver = new ChromeDriver();
		char[] charArray = Stringtest.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
            char character = charArray[i];
            System.out.println("Character at odd index " + i + ": " + character);
            character = Character.toUpperCase(character);
            System.out.println(character);
            
        
		}
		

	}
	}
}
