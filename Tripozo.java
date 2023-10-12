package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tripozo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ant-menu-title-content']//a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-form_origin']")).sendKeys("MAA");
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-form_destination']")).sendKeys("GOX");
		driver.findElement(By.xpath("(//span[text()='Goa'])[2]")).click();
		driver.findElement(By.xpath("//table[@class='dptbl noinnerborder']//tr[4]//td[5]")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='6 AM - 12PM']")).click();
		WebElement a = driver.findElement(By.xpath("(//div[@class='refund-Info show-gt-mobile'])[5]"));
		Actions a1 = new Actions(driver);
		a1.scrollToElement(a).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[5]")).click();
		String b = driver.findElement(By.xpath("//div[text()='Air India']")).getText();
		System.out.println(b);
		String b1 = "Air India";
		if(b1.equals(b)) {
			System.out.println("All the displayed airline are selected one");
			}else {
				System.out.println("All the displayed airlines are not selected one");
			}
		driver.findElement(By.xpath("//button[contains(@class,'choose-button tpz-btn')]")).click();
		Thread.sleep(2000);
		String c = driver.findElement(By.xpath("(//span[text()='Refundable'])[2]")).getText();
		System.out.println(c);
		String c1="Refundable";
		if(c1.equals(c)) {
			System.out.println("The choosed airline is with refundable option");
		}else {
			System.out.println("The choosed ailrine is not with refundable option");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Flight Info']")).click();
		Thread.sleep(3000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Snaps/pic1.png");
		FileUtils.copyFile(src, des);
		driver.findElement(By.xpath("//button[@class='ant-modal-close']//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Fare Info']")).click();
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./Snaps/pic2.png");
		FileUtils.copyFile(src1, des1);
		driver.close();
		
		

	}

}
