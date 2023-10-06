package assignment4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		String a = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(a);
		String b = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Number of customers rated:"+b);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		for (String a1 : driver.getWindowHandles()) {
			driver.switchTo().window(a1);
		}
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.xpath("//span[text()=' Have one to sell? ']"));
		Actions d1 = new Actions(driver);
		d1.moveToElement(d).perform();
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Snaps/entireWebpage.png");
		FileUtils.copyFile(src, des);
		driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
		String c = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(c);
		if( a == c) {
			System.out.println("The Whole price is equal to cart subtotal");
		}
		else {
			System.out.println("The Whole price is not equal to cart subtotal");
		}
		
		
	}

}
