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

public class Tripozo1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tripozo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()=' Hotels']")).click();
		driver.findElement(By.xpath("//input[@id='CityData']")).sendKeys("Goa");
		driver.findElement(By.xpath("//span[text()='Goa']")).click();
		driver.findElement(By.xpath("//div[text()='12']")).click();
		driver.findElement(By.xpath("//div[text()='13']")).click();
		driver.findElement(By.xpath("(//button[@type='submit']//i)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Air Conditioning']")).click();
		driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
		driver.findElement(By.xpath("//span[text()='Parking']")).click();
		driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
		WebElement z = driver.findElement(By.xpath("//span[@class='old']"));
		Actions z1 = new Actions(driver);
		z1.moveToElement(z).perform();
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[6]/label[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//span[text()='Choose']")).click();
		Thread.sleep(2000);
		String y = driver.findElement(By.xpath("(//div[@class='cp-location-date']//p)[2]")).getText();
		System.out.println(y);
		String y1="12 Oct 2023";
		if(y1.equals(y)) {
			System.out.println("Check-In date is verified");
		}else {
			System.out.println("Check-In date is not verified ");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='blocklink nowrap blnk-small blnkB fs12 pdl5 rnd5']")).click();
		driver.findElement(By.xpath("//span[text()='Choose Room ']")).click();
		driver.findElement(By.xpath("(//span[text()='Room '])[2]")).click();
		Thread.sleep(2000);
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File des1 = new File("./Snaps/roompic.png");
		FileUtils.copyFile(src1, des1);
		driver.close();
		
}
}