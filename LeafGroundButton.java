package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
        WebElement button = driver.findElement(By.xpath("(//div[@class='grid button-demo']//div)[3]"));
        if (!button.isEnabled()) {
            System.out.println("The button is enabled.");
        } else {
            System.out.println("The button is disenabled.");
            }
        WebElement button1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
        Point buttonPosition = button1.getLocation();
        int x = buttonPosition.getX();
        int y = buttonPosition.getY();
        System.out.println("Button position - X: " + x + ", Y: " + y);
        WebElement b = driver.findElement(By.xpath("//span[text()='Save']"));
        String buttonColor = b.getCssValue("color");
        System.out.println("Button color: " + buttonColor);
        WebElement c = driver.findElement(By.xpath("//span[text()='Submit']"));
        Dimension buttonSize = c.getSize();
        int buttonHeight = buttonSize.getHeight();
        System.out.println("Button height: " + buttonHeight);
        driver.close();
        
        
        
        

	
	
		
	}

}
