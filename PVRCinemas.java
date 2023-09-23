package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement a = driver.findElement(By.xpath("//select[@name='city']"));
		Select opt = new Select(a);
		Thread.sleep(3000);
		opt.selectByValue("Chennai");
		WebElement b = driver.findElement(By.xpath("//select[@name='genre']"));
		Select opt1 = new Select(b);
		opt1.selectByIndex(3);
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//select[@name='lang']"));
		Select opt2 = new Select(c);
		Thread.sleep(3000);
		opt2.selectByVisibleText("ENGLISH");
	    driver.findElement(By.xpath("//button[text()='Apply']")).click();
		WebElement d = driver.findElement(By.xpath("//div[text()='Paw Patrol']"));
		driver.executeScript("arguments[0].click()",d);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement e =driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select opt3 = new Select(e);
		Thread.sleep(3000);
		opt3.selectByVisibleText("PVR Theyagaraja Thiruvanmiyur Chennai");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Meena Magesh");
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("4");
		WebElement f = driver.findElement(By.xpath("//select[@name='timings']"));
		Select opt4 = new Select(f);
		Thread.sleep(3000);
		opt4.selectByIndex(3);
		WebElement g = driver.findElement(By.xpath("//select[@name='food']"));
		Select opt5 =new Select(g);
		Thread.sleep(3000);
		opt5.selectByVisibleText("Yes");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567897");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("AC");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary rightFloat']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		}
}
