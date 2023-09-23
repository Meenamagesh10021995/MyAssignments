package homeassignment;

public class WebElement {
	public void click() {
		System.out.println("Click");
		
	}
	public void setText(String text) {
		System.out.println("text");
		
	}
	public static void main(String[] args) {
		WebElement aa1 = new WebElement();
		aa1.click();
		aa1.setText("Software Testing");
	}

}
