package homeassignment;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Submit");
		
	}
	public static void main(String[] args) {
		Button bb1 = new Button();
		bb1.click();
		bb1.setText("Software Testing");
		bb1.submit();
	}

}
