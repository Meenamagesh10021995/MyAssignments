package assignment4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsNyka {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement d = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions aa = new Actions(driver);
		aa.moveToElement(d).perform();
		driver.findElement(By.xpath("//span[text()='Help']/following::input")).sendKeys("L'Oréal Paris");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-150nd8c']//a[1]")).click();
		String title  = driver.getTitle();
		System.out.println(title);
		WebElement aa1 = driver.findElement(By.xpath("(//div[@class='css-xrzmfa'])[3]"));
		Actions b = new Actions(driver);
		b.scrollToElement(aa1).perform();
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		WebElement bb = driver.findElement(By.xpath("(//span[@class='css-cjd9an'])[3]"));
		Actions c = new Actions(driver);
		c.scrollToElement(bb).perform();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		Thread.sleep(2000);
		WebElement cc = driver.findElement(By.xpath("(//span[text()='30% Off'])[3]"));
		Actions d1 = new Actions(driver);
		d1.scrollToElement(cc).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//label[@for='checkbox_Colour Protection_229250']//div)[2]")).click();
		WebElement sha = driver.findElement(By.xpath("//span[@class='filter-value']"));
		if(sha.getText().contains("Shampoo")) {
			System.out.println("Filters are applied with Shampoo");
		}else {
			System.out.println("Filters are not applied with shampoo");
		}
		driver.findElement(By.xpath("//div[@class='css-1rd7vky']//div")).click();
		for (String z : driver.getWindowHandles()) {
			driver.switchTo().window(z);
			}
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String e = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println( "MRP:"+ e);
		driver.findElement(By.xpath("//span[@class='btn-text']")).click();
		driver.findElement(By.xpath("//span[text()='1']")).click();
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>windows=new ArrayList<String>(windowHandles);
		//driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String f = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("Grand Total:"+ f);
		driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();
		//driver.findElement(By.xpath("(//button[@class='css-tzuruw e8tshxd1'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1edwnq3 e9pts8a1'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1edwnq3 e9pts8a1']/following::button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-gecnnw eqr1d9n12']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3']//img)[2]")).click();
		Thread.sleep(2000);
        String tot = driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]")).getText();
		System.out.println(tot);
		if(f==tot) {
			System.out.println("Grand total and cart total are equal");
		}else {
			System.out.println("Grand total and cart total are not equal");
		}
		
	}
}
		
