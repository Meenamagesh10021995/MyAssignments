package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafRadioButton {

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Chrome']"));
		if (!checkbox.isSelected()) {
        	checkbox.click();
        	}
		Thread.sleep(3000);
		WebElement radioButton = driver.findElement(By.xpath("//label[text()='Firefox']"));
		radioButton.click();
		if (radioButton.isSelected()) {
            System.out.println("The radio button is selected.");
        } else {
            System.out.println("The radio button is not selected.");
        }
		Thread.sleep(3000);
		radioButton.click();
		if (!radioButton.isSelected()) {
            System.out.println("The radio button is unselected.");
        } else {
            System.out.println("The radio button is still selected.");
        }
		WebElement initiallySelectedRadioButton = null;
		WebElement[] radioButtons = null;
		for (WebElement radioButton1 : radioButtons) {
            if (radioButton1.isSelected()) {
            	initiallySelectedRadioButton = radioButton;
                break;
            }
        }
		if (initiallySelectedRadioButton != null) {
            String value = initiallySelectedRadioButton.getText();
            String label = initiallySelectedRadioButton.getText();
            System.out.println("Initially selected radio button - Value: " + value + ", Label: " + label);
        } else {
            System.out.println("No radio button is initially selected.");
        }
		String ageGroupValue = "21-40";
        WebElement ageGroupRadioButton = driver.findElement(By.xpath("//input[@value='" + ageGroupValue + "']"));
        if (!ageGroupRadioButton.isSelected()) {
            // If not selected, click on it to select it
            ageGroupRadioButton.click();
            System.out.println("Age group (21-40 Years) is now selected.");
        } else {
            System.out.println("Age group (21-40 Years) is already selected.");
        }

	}

}
