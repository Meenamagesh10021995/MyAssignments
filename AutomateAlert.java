package assignment4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@class='grid-image']")).click();
		driver.findElement(By.id("wk_zipcode")).sendKeys("630561");
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//p[@class='success-message show-cart'])[2]")).click();
		driver.findElement(By.id("checkout")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		}

}
